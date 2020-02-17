<html>
    <head>
        <title>KALKULATOR PODATKOWY</title>
        <style type="text/css">
            html{
                font-family: sans-serif;
            }
            p{
                color: darkblue;  
             }
             #textbox{
                padding-left: 25px;
                padding-top: 5px;
             }
             input[type=submit] {
                font-size: 20px;
                height: 40px;
                width: 200px;
                padding:5px 15px; 
                background: lightsteelblue; 
                border:0 none;
                cursor:pointer;
                -webkit-border-radius: 5px;
                border-radius: 5px; 
             }
             input[type=reset] {
                font-size: 20px;
                height: 40px;
                width: 200px;
                padding:5px 15px; 
                background: lightsteelblue; 
                border:0 none;
                cursor:pointer;
                -webkit-border-radius: 5px;
                border-radius: 5px; 
             }
             .tg  {
                 border-collapse:collapse;
                 border-spacing:0;
             }
             .tg td{
                 font-family:Arial, sans-serif;
                 font-size:14px;
                 padding:10px 5px;
                 border-style:solid;
                 border-width:1px;
                 overflow:hidden;
                 word-break:normal;
                 border-color:black
                     
             .tg th{
                 font-family:Arial, sans-serif;
                 font-size:14px;
                 font-weight:normal;
                 padding:10px 5px;
                 border-style:solid;
                 border-width:1px;
                 overflow:hidden;
                 word-break:normal;
                 border-color:black;
             }
             .tg .tg-cly1{
                 text-align:left;
                 vertical-align:middle
             }
             .tg .tg-0lax{
                 text-align:left;
                 vertical-align:top
             }
        </style>
    </head>

    <body bgcolor="#d6f5f5" color="red">
        <h1>Kalkulator Podatkowy</h1>
        <hr>

        <form action="form.jsp" method="POST">
            <p>Twoja miesieczna wyplata <b style="color: blue">Netto:
                    <br><p id="textbox"><input type="text" name="num1" size="25"></p></b>
            </p>
            <p>Kwota miesiecznie przeznaczana na produkty objete obnizona stawka VAT <b style="color: blue">(Zywnosc, Ksiazki, Transport, Rozrywka i Rekreacja, Leki i Zdrowie, Mieszkanie i Energia):
                    <br><p id="textbox"><input type="text" name="num2" size="25"></p></b>
            </p>
            <p>Kwota miesiecznie przeznaczana na produkty objete podstawowa stawka VAT <b style="color: blue">(Art. Higien., Odziez, Tel. i Int., Inne):
                    <br><p id="textbox"><input type="text" name="num3" size="25"></p></b>
            </p>
            <p>Kwota miesiecznie przeznaczana na <b style="color: blue">Alkohol:
                    <br><p id="textbox"><input type="text" name="num4" size="25"></p></b>
            </p>
            <p>Kwota miesiecznie przeznaczana na <b style="color: blue">Paliwo:
                    <br><p id="textbox"><input type="text" name="num5" size="25"></p></b>
            </p>
            <p>Kwota miesiecznie przeznaczana na <b style="color: blue">Wyroby Tytoniowe:
                    <br><p id="textbox"><input type="text" name="num6" size="25"></p></b>
            </p>
            <br>
            <p id="textbox">
                <input type="submit" value="Oblicz">
                <input type="reset" value="Reset"></p>
            </p>
        </form>
    </body>
</html>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page import="com.javakalk.exmple.ejb.*, javax.naming.*"%>

<%!
    private KalkulatorSessionBeanRemote ops = null;
    float result,emzus,emkrus,renta,emmund,dodem,nfzem,bezrob,pincet,zdrow,
          wojsko,mundur,sady,szkola,ucz,drkraj,drsamo,kolej,trans,adminrzad,
          adminsamo,adminzus,naczel,srod,rol,sport,kult,ue,inne,dlug = 0;

    public void jspInit() {
        try {

            InitialContext ic = new InitialContext();
            ops = (KalkulatorSessionBeanRemote)ic.lookup(KalkulatorSessionBeanRemote.class.getName());
            

            System.out.println("Loaded Calculator Bean");


        } catch (Exception ex) {
            System.out.println("Error:"
                    + ex.getMessage());
        }
    }

    public void jspDestroy() {
        ops = null;
    }
%>


<%

    try {
        String s1 = request.getParameter("num1");
        String s2 = request.getParameter("num2");
        String s3 = request.getParameter("num3");
        String s4 = request.getParameter("num4");
        String s5 = request.getParameter("num5");
        String s6 = request.getParameter("num6");

        System.out.println(s3);

        
            Float num1 = new Float(s1);
            Float num2 = new Float(s2);
            Float num3 = new Float(s3);
            Float num4 = new Float(s4);
            Float num5 = new Float(s5);
            Float num6 = new Float(s6);

                result = ops.podatek(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                emzus = ops.emzus(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                emkrus = ops.emkrus(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                renta = ops.renta(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                emmund = ops.emmund(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
               dodem = ops.dodem(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                nfzem = ops.nfzem(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                bezrob = ops.bezrob(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                pincet = ops.pincet(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                zdrow = ops.zdrow(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                wojsko = ops.wojsko(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                mundur = ops.mundur(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                sady = ops.sady(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                szkola = ops.szkola(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                ucz = ops.ucz(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                drkraj = ops.drkraj(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                drsamo = ops.drsamo(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                kolej = ops.kolej(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                trans = ops.trans(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                adminrzad = ops.adminrzad(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                adminsamo = ops.adminsamo(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                adminzus = ops.adminzus(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                naczel = ops.naczel(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                srod = ops.srod(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                rol = ops.rol(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                sport = ops.sport(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                kult = ops.kult(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                ue = ops.ue(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                inne = ops.inne(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());
                dlug = ops.dlug(num1.floatValue(), num2.floatValue(), num3.floatValue(), num4.floatValue(), num5.floatValue(), num6.floatValue());  
%>
<p>
    <h2>Suma zaplaconych przez ciebie podatkow: <%= result%>zł.</h2><br>
    <table class="tg">
  <tr>
    <td class="tg-01ax">Emerytury z ZUS:</td>
    <td class="tg-0lax"><%= emzus%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Emerytury z KRUS:</td>
    <td class="tg-0lax"><%= emkrus%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Renty z ZUS i KRUS:</td>
    <td class="tg-0lax"><%= renta%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Emerytury i renty żołnierzy, policjantów i pozostalych służb mundurowych, sędziów i prokuratorów:</td>
    <td class="tg-0lax"><%= emmund%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Dodatki do rent i emerytur, dodatki pielęgnacyjne, zasiłki chorobowe, itp.:</td>
    <td class="tg-0lax"><%= dodem%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Składki NFZ i PIT emerytów i rencistów:</td>
    <td class="tg-0lax"><%= nfzem%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Pomoc społeczna, wsparcie dla bezrobotnych:</td>
    <td class="tg-0lax"><%= bezrob%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Rodzina 500+:</td>
    <td class="tg-0lax"><%= pincet%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Ochona zdrowia:</td>
    <td class="tg-0lax"><%= zdrow%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Wojsko:</td>
    <td class="tg-0lax"><%= wojsko%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Policja, straż pożarna, straż graniczna, BOR, ABW, AW i CBA:</td>
    <td class="tg-0lax"><%= mundur%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Sądy i więzienia:</td>
    <td class="tg-0lax"><%= sady%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Przedszkola, podstawówki, gimnazja i szkoły średnie:</td>
    <td class="tg-0lax"><%= szkola%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Szkolnictwo wyższe:</td>
    <td class="tg-0lax"><%= ucz%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Drogi krajowe:</td>
    <td class="tg-0lax"><%= drkraj%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Drogi samorządowe:</td>
    <td class="tg-0lax"><%= drsamo%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Kolej i tory:</td>
    <td class="tg-0lax"><%= kolej%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Pozostałe wydatki na transport:</td>
    <td class="tg-0lax"><%= trans%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Administracja rządowa:</td>
    <td class="tg-0lax"><%= adminrzad%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Administracja samorządowa:</td>
    <td class="tg-0lax"><%= adminsamo%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Administracja ZUS, KRUS i NFZ:</td>
    <td class="tg-0lax"><%= adminzus%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Urzędy naczelnych organów władzy państwowej, kontroli i ochrony prawa oraz sądownictwa:</td>
    <td class="tg-0lax"><%= naczel%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Ochrona środowiska:</td>
    <td class="tg-0lax"><%= srod%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Rolnictwo, leśnictwo i rybołówstwo:</td>
    <td class="tg-0lax"><%= rol%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Sport i wypoczynek:</td>
    <td class="tg-0lax"><%= sport%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Kultura:</td>
    <td class="tg-0lax"><%= kult%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Składka do budzetu UE:</td>
    <td class="tg-0lax"><%= ue%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Inne:</td>
    <td class="tg-0lax"><%= inne%>zł.</td>
  </tr>
  <tr>
    <td class="tg-0lax">Koszt obsługi długu publicznego:</td>
    <td class="tg-0lax"><%= dlug%>zł.</td>
  </tr>
</table>
<p>

    <%
            
        }// end of try
        catch (Exception e) {
            e.printStackTrace();
            //result = "Not valid";
        }
    %>