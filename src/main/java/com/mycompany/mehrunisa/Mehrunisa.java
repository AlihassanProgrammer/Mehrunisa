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
    public Mehrunisa(String text) {
        this.text = text;
        }        
    public void speak() throws Exception{
             Voice voice;
            VoiceManager voiceManager = VoiceManager.getInstance();
               voice = voiceManager.getVoice(VOICENAME_kevin);    
                System.out.println("Voice :" + voice);
                voice.allocate();
                voice.speak(text);
        }

            
    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
        String message = "Hello world! This is a test program";
         Mehrunisa mehrunisa = new Mehrunisa(message);
         mehrunisa.speak();
    }
    
}
