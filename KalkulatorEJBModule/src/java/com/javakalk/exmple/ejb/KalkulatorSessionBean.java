/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakalk.exmple.ejb;

import javax.ejb.Stateless;

/**
 *
 * @author Dominika
 */
@Stateless
public class KalkulatorSessionBean implements KalkulatorSessionBeanRemote {

    public static double round(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public float podatek(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*6966)+(vatzm*12*706)+(vatpod*12*1403)+(alkohol*12*6812)+(paliwo*12*5462)+(tyton*12*7183))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }

    @Override
    public float emzus(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*1026)+(vatzm*12*104)+(vatpod*12*206)+(alkohol*12*1014)+(paliwo*12*803)+(tyton*12*1056))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }

    @Override
    public float emkrus(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*84)+(vatzm*12*8)+(vatpod*12*17)+(alkohol*12*72)+(paliwo*12*67)+(tyton*12*87))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }

    @Override
    public float renta(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*290)+(vatzm*12*29)+(vatpod*12*58)+(alkohol*12*290)+(paliwo*12*227)+(tyton*12*298))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float emmund(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*124)+(vatzm*12*13)+(vatpod*12*25)+(alkohol*12*109)+(paliwo*12*97)+(tyton*12*127))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float dodem(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*231)+(vatzm*12*23)+(vatpod*12*46)+(alkohol*12*217)+(paliwo*12*182)+(tyton*12*238))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float nfzem(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*361)+(vatzm*12*37)+(vatpod*12*73)+(alkohol*12*362)+(paliwo*12*283)+(tyton*12*373))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float bezrob(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*466)+(vatzm*12*47)+(vatpod*12*94)+(alkohol*12*471)+(paliwo*12*365)+(tyton*12*480))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float pincet(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*178)+(vatzm*12*18)+(vatpod*12*36)+(alkohol*12*181)+(paliwo*12*138)+(tyton*12*183))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float zdrow(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*763)+(vatzm*12*77)+(vatpod*12*154)+(alkohol*12*761)+(paliwo*12*589)+(tyton*12*786))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float wojsko(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*258)+(vatzm*12*26)+(vatpod*12*52)+(alkohol*12*254)+(paliwo*12*202)+(tyton*12*266))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float mundur(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*147)+(vatzm*12*15)+(vatpod*12*30)+(alkohol*12*145)+(paliwo*12*115)+(tyton*12*151))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float sady(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*100)+(vatzm*12*10)+(vatpod*12*20)+(alkohol*12*109)+(paliwo*12*78)+(tyton*12*26))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float szkola(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*626)+(vatzm*12*63)+(vatpod*12*126)+(alkohol*12*616)+(paliwo*12*490)+(tyton*12*647))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float ucz(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*156)+(vatzm*12*16)+(vatpod*12*31)+(alkohol*12*145)+(paliwo*12*122)+(tyton*12*163))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float drkraj(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*164)+(vatzm*12*17)+(vatpod*12*33)+(alkohol*12*145)+(paliwo*12*128)+(tyton*12*171))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float drsamo(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*221)+(vatzm*12*22)+(vatpod*12*44)+(alkohol*12*217)+(paliwo*12*173)+(tyton*12*226))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float kolej(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*119)+(vatzm*12*12)+(vatpod*12*24)+(alkohol*12*109)+(paliwo*12*93)+(tyton*12*123))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float trans(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*93)+(vatzm*12*9)+(vatpod*12*19)+(alkohol*12*109)+(paliwo*12*73)+(tyton*12*95))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float adminrzad(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*115)+(vatzm*12*12)+(vatpod*12*23)+(alkohol*12*109)+(paliwo*12*90)+(tyton*12*119))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float adminsamo(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*182)+(vatzm*12*18)+(vatpod*12*37)+(alkohol*12*181)+(paliwo*12*143)+(tyton*12*187))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float adminzus(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*40)+(vatzm*12*4)+(vatpod*12*8)+(alkohol*12*36)+(paliwo*12*32)+(tyton*12*40))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float naczel(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*21)+(vatzm*12*2)+(vatpod*12*4)+(alkohol*12*36)+(paliwo*12*17)+(tyton*12*24))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float srod(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*184)+(vatzm*12*19)+(vatpod*12*37)+(alkohol*12*181)+(paliwo*12*143)+(tyton*12*190))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
     @Override
    public float rol(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*115)+(vatzm*12*12)+(vatpod*12*23)+(alkohol*12*109)+(paliwo*12*90)+(tyton*12*119))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
     @Override
    public float sport(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*55)+(vatzm*12*6)+(vatpod*12*11)+(alkohol*12*36)+(paliwo*12*43)+(tyton*12*56))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float kult(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*91)+(vatzm*12*9)+(vatpod*12*18)+(alkohol*12*72)+(paliwo*12*72)+(tyton*12*95))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float ue(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*148)+(vatzm*12*15)+(vatpod*12*30)+(alkohol*12*145)+(paliwo*12*115)+(tyton*12*151))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float inne(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*363)+(vatzm*12*37)+(vatpod*12*73)+(alkohol*12*362)+(paliwo*12*285)+(tyton*12*373))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
    
    @Override
    public float dlug(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton) {
        float x = ((podstawa*12*249)+(vatzm*12*25)+(vatpod*12*50)+(alkohol*12*254)+(paliwo*12*195)+(tyton*12*258))/10000;
        double f = round(x, 2);
        float y = (float)f;
        return y;
    }
}
