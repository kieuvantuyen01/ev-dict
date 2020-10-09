/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EVDict4_1;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author ADMIN
 */
public class VoiceImplement {
    
    public void HandleVoice (String word) {
        Voice voice;
        VoiceManager voiceManager = VoiceManager.getInstance();   
        voice = voiceManager.getVoice("kevin16");
        voice.allocate();
        voice.speak(word);
    }
}
