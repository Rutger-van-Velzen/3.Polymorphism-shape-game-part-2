package org.example;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GravityUpdate implements ActionListener {
    private static final GravityUpdate GRAVITY_UPDATE = new GravityUpdate();

    private GravityUpdate(){}

    public static GravityUpdate getInstance(){
        return GRAVITY_UPDATE;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateAllGravityObjects();
        Panel.getInstance().repaint();
    }

    private void updateAllGravityObjects(){

    }
}
