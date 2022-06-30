package application.back.simulation.state;

import application.back.simulation.items.BusSimulation;

public class ChargePassagersBusState extends BusState{

    public ChargePassagersBusState(BusSimulation bus) {
        super(bus);
    }

    @Override
    public void display() {
        System.out.println("Le bus : "+bus.getId()+ " est affecté à la ligne: "+bus.getCurrentLigneId()+" Il Charge des passagers à l'arret: "+bus.getCurrentArretNom());
    }

}
