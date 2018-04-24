/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mehrunisa;
import com.sun.speech.freetts.*;
/**
 *
 * @author Ali Hassan
 */
public class Mehrunisa {

    private static final String VOICENAME_kevin = "kevin";
        private String text; // string to speech
        public void speak() {
            Voice voice;
            VoiceManager voiceManager = VoiceManager.getInstance();
            voice = voiceManager.getVoice(VOICENAME_kevin);
            voice.allocate();
            voice.speak(text);
        }

        public Mehrunisa(String text) {
        this.text = text;
        }        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          String text = "Hello ";
         Mehrunisa mehrunisa = new Mehrunisa(text);
         mehrunisa.speak();
    }
    
}
