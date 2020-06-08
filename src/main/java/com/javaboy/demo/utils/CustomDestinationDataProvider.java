package com.javaboy.demo.utils;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public class CustomDestinationDataProvider {

    /**
     * qj
     */
    static class MyDestinationDataProvider /*implements DestinationDataProvider*/ {
//        private DestinationDataEventListener eL;
        private ConcurrentHashMap<String, PropertiesHa> secureDBStorage = new ConcurrentHashMap<String, PropertiesHa>();

        // 实现接口：获取连接配置属性
        public Properties getDestinationProperties(String destinationName) {
//            try{
                //read the destination from DB
                PropertiesHa p = secureDBStorage.get(destinationName);

                if(p!=null)
                {
                    //check if all is correct, for example
                    if(p.isEmpty())
//                        throw new DataProviderException(DataProviderException.Reason.INVALID_CONFIGURATION, "destination configuration is incorrect", null);

                    return p;
                }

                return null;
//            }
//            catch(RuntimeException re) {
//                throw new DataProviderException(DataProviderException.Reason.INTERNAL_ERROR, re);
//            }
        }


    } // end of MyDestinationDataProvider

    //business logic

    static Properties getDestinationPropertiesFromUI() {
        //adapt parameters in order to configure a valid destination
        Properties connectProperties = new Properties();
        /*connectProperties.setProperty(DestinationDataProvider.JCO_ASHOST, "192.168.108.105");
        connectProperties.setProperty(DestinationDataProvider.JCO_SYSNR,  "01");
        connectProperties.setProperty(DestinationDataProvider.JCO_CLIENT, "620");
        connectProperties.setProperty(DestinationDataProvider.JCO_USER,   "rpa3");
        connectProperties.setProperty(DestinationDataProvider.JCO_PASSWD, "123456");
        connectProperties.setProperty(DestinationDataProvider.JCO_LANG,   "ZH");*/
        MyDestinationDataProvider myDestinationDataProvider=new MyDestinationDataProvider();
        try {
            connectProperties.load(myDestinationDataProvider.getClass().getResourceAsStream("/sap_conf.properties"));
            System.out.println("SAP链接配置文件<<<<<<<<<"+connectProperties);
        } catch (IOException e) {

        }
        return connectProperties;
    }

}
