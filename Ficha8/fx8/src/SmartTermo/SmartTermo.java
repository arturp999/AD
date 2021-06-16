package SmartTermo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Date;

public class SmartTermo {
    protected JButton decreaseButton;
    protected JPanel contentPanel;
    protected JButton increaseButton;
    protected JButton changeCF;
    protected JLabel result;
    protected JButton increaseButtonTemp;
    protected JButton decreaseButton1;
    protected JLabel humidade;
    protected JLabel currentTime;
    protected JButton ON_OFF_BUTTON;
    protected JLabel statusON_Off;
    protected JLabel setTempTo;
    private JTextArea tempLog;

    protected double temperatura = 20;
    protected double wantedTemp = 0;
    protected double wantedTempF;
    protected double valorHumidade = 70;
    protected double fahrenheit;
    protected boolean changeFC = true;
    protected boolean ON_OR_OFF;
    Timer timerReduz;
    Timer timerAumenta;

    public SmartTermo() {
           currentTime.setText("" + new Date());
        ////////////////botao do aquecimento em fez de fazer isto no gui/////////////////////////
        statusON_Off.setText("Heating is OFF");
        ON_OFF_BUTTON.setText("ON");
        setTempTo.setText("Set to: " + wantedTemp);
        ///////////////////////TIMER////////////////////////////////////////////////////////////////
        timerReduz = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double prob30 = Math.random() * 100;
                if (prob30 < 30) {
                    temperatura = temperatura - 0.5;
                    tempLog.append("Temperature is decreasing: " + temperatura + "\n");
                    if (!changeFC) {
                        fahrenheit = temperatura * (9f / 5) + 32;
                        result.setText("Currently " + Math.round(fahrenheit * 100) / 100.0d + "º" + " F");
                    } else {
                        result.setText("Currently " + temperatura + "º" + " C");
                    }
                }
            }
        });
        timerReduz.start();
        //////////////////////////////////////////////////////////////TIMER PARA AUMENTAR TEMPERATURA//////////////////////////////////////////////////////////////
        timerAumenta = new Timer(2000, new ActionListener() { //ta em milesegundos
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double prob80 = Math.random() * 100;
                if (prob80 < 80 && wantedTemp > temperatura || prob80 < 80 && ON_OR_OFF && wantedTemp > temperatura) {
                    ON_OR_OFF = true;
                    statusON_Off.setText("Heating is ON");
                    ON_OFF_BUTTON.setText("OFF");
                    temperatura = temperatura + 0.5;
                    tempLog.append("Temperature has increased: " + temperatura + "\n");
                    System.out.println(temperatura + " up");
                    if (!changeFC) {
                        fahrenheit = temperatura * (9f / 5) + 32;
                        result.setText("Currently " + Math.round(fahrenheit * 100) / 100.0d + "º" + " F");
                    } else {
                        result.setText("Currently " + temperatura + "º" + " C");
                    }
                }
            }
        });
        timerAumenta.start();
        //////////////////////////////////////////BOTOES ////////////////////////////////////////////////////////////
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wantedTemp = wantedTemp + 0.5;
                if (!changeFC) {
                    wantedTempF = wantedTemp * (9f / 5) + 32;
                    setTempTo.setText("Set to " + Math.round(wantedTempF * 100) / 100.0d + "º" + " F");
                } else {
                    setTempTo.setText("Set to " + wantedTemp + "º" + " C");
                }
            }
        });
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                wantedTemp = wantedTemp - 0.5;
                if (!changeFC) {
                    wantedTempF = wantedTemp * (9f / 5) + 32;
                    setTempTo.setText("Set to " + Math.round(wantedTempF * 100) / 100.0d + "º" + " F");
                } else {
                    setTempTo.setText("Set to " + wantedTemp + "º" + " C");
                }
            }
        });
        changeCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (!changeFC) {
                    changeFC = true;
                    result.setText("Currently " + temperatura + "º" + " C");
                    setTempTo.setText("Set to " + wantedTemp + "º" + " C");
                    changeCF.setText("Fahrenheit");
                    tempLog.append("Temperature changed to Celcius" + "\n");
                } else {
                    changeFC = false;
                    fahrenheit = temperatura * (9f / 5) + 32;
                    result.setText("Currently " + Math.round(fahrenheit * 100) / 100.0d + "º" + " F");
                    wantedTempF = wantedTemp * (9f / 5) + 32;
                    setTempTo.setText("Set to " + Math.round(wantedTempF * 100) / 100.0d + "º" + " F");
                    changeCF.setText("Celcius");
                    tempLog.append("Temperature changed to Fahrenheit" + "\n");
                }
            }
        });
        increaseButtonTemp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                valorHumidade = valorHumidade + 5;
                humidade.setText("Humidity " + valorHumidade + "%");
                tempLog.append("Humidity has increased" + "\n");
            }
        });
        decreaseButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                valorHumidade = valorHumidade - 5;
                humidade.setText("Humidity " + valorHumidade + "%");
                if (valorHumidade < 0) {
                    valorHumidade = 0;
                    humidade.setText("Humidity " + valorHumidade + "%");
                    tempLog.append("Humidity has decreased" + "\n");
                }
            }
        });
        ON_OFF_BUTTON.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ON_OR_OFF) {
                    ON_OR_OFF = false;
                    statusON_Off.setText("Heating is OFF");
                    tempLog.append("Heating is OFF " + "\n");
                    ON_OFF_BUTTON.setText("ON");
                    timerAumenta.stop();
                } else {
                    ON_OR_OFF = true;
                    statusON_Off.setText("Heating is ON");
                    tempLog.append("Heating is ON " + "\n");
                    ON_OFF_BUTTON.setText("OFF");
                    timerAumenta.start();
                }
            }
        });
    }

    public JPanel getPanelMain() {
        return contentPanel;
    }
}

