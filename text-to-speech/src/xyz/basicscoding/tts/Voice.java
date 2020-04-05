package xyz.basicscoding.tts;

import com.sun.speech.freetts.VoiceManager;

public class Voice {
private String name;
private com.sun.speech.freetts.Voice voice;
public Voice(String name) {
	// TODO Auto-generated constructor stub
this.name=name;
this.voice=VoiceManager.getInstance().getVoice(this.name);
this.voice.allocate();
}
public void say(String any) {
	this.voice.speak(any);
}
public void sayM(String[] anyM) {
	for (int i = 0; i < anyM.length; i++) {
		this.say(anyM[i]);
	}
}
}
