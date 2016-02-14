package com.nnk.recharge.batch.config;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 * Created by wusz on 2015/12/24.
 */
@XmlAccessorType(XmlAccessType.NONE)
public class Param {
    @XmlAttribute
    private int type;
    @XmlAttribute
    private int command;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getCommand() {
        return command;
    }

    public void setCommand(int command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Param{" +
                "type=" + type +
                ", command=" + command +
                '}';
    }
}
