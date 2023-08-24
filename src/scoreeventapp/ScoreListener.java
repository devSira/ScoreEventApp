/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreeventapp;

import java.util.EventListener;

/**
 *
 * @author Siraphob.B
 */
public interface ScoreListener extends EventListener {
    	public void scoreChange(ScoreEvent e);
}
