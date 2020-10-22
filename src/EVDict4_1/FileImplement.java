package EVDict4_1;

import java.io.*;

public class FileImplement extends DictionaryData {

    public FileImplement(dictionaryType new_state) {
        if (new_state == dictionaryType.VE) {
            this.path = "data\\V_E.txt";
            this.state = new_state;
        }
        readFile();
    }

    public void readFile() {

        try {
            FileReader fis = new FileReader(path);
            BufferedReader br = new BufferedReader(fis);

            String line, new_word, meaning;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("<html>");
                if (parts.length == 2) {
                    new_word = parts[0];
                    meaning = "<html>" + parts[1];
                    word.add(new_word);
                    DictData.put(new_word, meaning);
                }
            }
            br.close();
            System.out.println("Số lượng từ của từ điển là: " + DictData.size());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateFile() throws IOException {
        FileWriter fos = new FileWriter(path);
        BufferedWriter bw = new BufferedWriter(fos);
        for (String new_word : word) {
            bw.write(new_word + DictData.get(new_word) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
