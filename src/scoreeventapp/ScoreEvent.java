/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreeventapp;

import java.util.EventObject;

/**
 *
 * @author Siraphob.B
 */
public class ScoreEvent extends EventObject {
    private String myValue;
	public ScoreEvent(Object source, String val) {
		super(source);
		myValue = val;
	}
	public String getScore() {
		return myValue;
	}
}
