package EVDict4_1;

import java.io.*;

public class FileImplement extends DictionaryData {
    

    public FileImplement(int new_state) {
        if (new_state == 1) {
            this.path = "src\\EVDict4_1\\V_E.txt";
            this.state = new_state;
        }
        readFile();
    }

    public void readFile() {

        try {
            FileInputStream fis = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, "utf-8"));

            String line, new_word, meaning;
            int wordsNum = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("<html>");
                new_word = parts[0];
                meaning = "<html>" + parts[1];
                    word.add(new_word);
                    EVDict.put(new_word, meaning);
                wordsNum++;
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void updateFile() throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos, "utf-8"));

        for (String new_word : word) {
            bw.write(new_word + EVDict.get(new_word) + "\n");
        }
        bw.close();        
    }
}
