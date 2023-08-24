/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreeventapp;

import java.util.ArrayList;

/**
 *
 * @author Siraphob.B
 */
public class ScoreSource {
    private String source;
	private ArrayList<ScoreListener> listeners;
	public ScoreSource() {
		listeners = new ArrayList<>();
	}
	public void setScoreLine(String val) {
		source = val;
		fireMyEvent(new ScoreEvent(this, source));
	}
	public String getSource() {
		return source;
	}
	public void addMyListener(ScoreListener l) {
		listeners.add(l);
	}
	public void removeMyListener(ScoreListener l) {
		listeners.remove(l);
	}
	public void fireMyEvent(ScoreEvent e) {
      for(int i = 0; i < listeners.size(); i++) {
			ScoreListener l = listeners.get(i);
			l.scoreChange(e);
		}
	}
}
