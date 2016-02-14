package com.nnk.recharge.batch.entity;

import com.nnk.recharge.batch.common.XmlUtil;
import com.nnk.recharge.batch.config.Param;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wusz on 2015/12/24.
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "rechargeType")
public class RechargeType {
    @XmlElement(name = "param")
    private List<Param> params = new ArrayList<Param>();
    private static RechargeType _type;

    public static RechargeType loadConfig(String filePath) throws FileNotFoundException, JAXBException {
        if (_type == null) {
            _type = XmlUtil.loadXmlFromFile(RechargeType.class, filePath);

        }
        return _type;
    }

    public List<Param> getParam() {
        return params;
    }

    public String toString() {
        try {
            return XmlUtil.toXml(_type);
        } catch (JAXBException e) {
        } catch (IOException e) {
        }
        return "";
    }

}
