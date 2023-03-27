import java.lang.reflect.Array;

public class models_app {
    public static void main (String[] args){
        System.out.println("test main");
        models_vehicle[] tab1 = new models_vehicle[4];
        tab1[0] = new models_car(240, "Qasqai", 7);
        tab1[1] = new models_car(666, "Micra", 3);
        tab1[2] = new models_plane(240, "S44", 500);
        tab1[3] = new models_plane(240, "Tupolev", 0);

        for(int i = 0; i < tab1.length; i++){
            System.out.println(tab1[i].toString());
        }
        System.out.println("");
        for (models_vehicle model : tab1) {
            System.out.println(model.toString());
        }
    }
}
