import jade.core.*;
import jade.core.behaviours.*;

public class MKRjade extends Agent {
    private guis gui;
    @Override
    protected void setup() {
        System.out.println("Inica el agente " + getLocalName());
        Dataset datos = new Dataset();
        datos.date();
        gui = new guis(this);
        gui.showGui();
    }

    public void  res(double x1, double x2) {
        System.out.println("-Agente activado-");
        addBehaviour(new Behaviour(){
            boolean end=false;
            @Override
            public void action(){

                Resultado r = new Resultado();
                System.out.printf("El resultado es: %.4f\n",r.resultante(x1,x2));
                end =true;
            }

            public boolean done() {
                if (end==true){
                    return true;
                }
                else{
                    return false;
                }
            }

            public int onEnd(){
                System.out.println("-Agente muriendo-");
                myAgent.doDelete();
                return super.onEnd();
            }
        });


    }

}

