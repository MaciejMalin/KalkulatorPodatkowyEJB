/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javakalk.exmple.ejb;

import javax.ejb.Remote;

/**
 *
 * @author Dominika
 */
@Remote
public interface KalkulatorSessionBeanRemote {
float podatek(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float emzus(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float emkrus(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float renta(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float emmund(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float dodem(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float nfzem(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float bezrob(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float pincet(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float zdrow(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float wojsko(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float mundur(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float sady(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float szkola(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float ucz(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float drkraj(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float drsamo(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float kolej(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float trans(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float adminrzad(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float adminsamo(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float adminzus(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float naczel(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float srod(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float rol(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float sport(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float kult(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float ue(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);

    float inne(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
    float dlug(float podstawa, float vatzm, float vatpod, float alkohol, float paliwo, float tyton);
    
}
