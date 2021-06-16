package org.example;



public class SimulatedDevice {
    // The device connection string to authenticate the device with your IoT hub.
    // Using the Azure CLI:
    // az iot hub device-identity create --hub-name ctesp-teste-2020 --device-id MyJavaDevice
    // az iot hub device-identity show-connection-string --hub-name ctesp-teste-2020 --device-id MyJavaDevice --output table
    private static String connString = "ctesp-teste-2020.azure-devices.net;DeviceId=MyJavaDevice;SharedAccessKey=z2uQYacN6DB0XSL69q+2z0l9MJG3MMlNS7hnf/2KfJ0=hoç";

    // Using the MQTT protocol to connect to IoT Hub
    private static IotHubClientProtocol protocol = IotHubClientProtocol.MQTT;
    private static DeviceClient client;
}
