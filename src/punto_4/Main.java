/***
 * Su grupo debe implementar un sistema de información para el evento Cali ExpoShow están invitados
cuatro (4) casas de moda Vallecaucanas y para los exhibidores se contrató a la empresa constructora
StandDecor: Utilizando alguno de los Patrones vistos en clase, diseñe un proyecto NetBeans java llamado
Punto_4 que modele de manera general la elaboración de los stand para cada una de las casas de
moda invitadas.
 */

package punto_4;

public class Main 
{    
        public static void main(String[] args) 
        {
            CreadorAbstract myCreador = new CreadorConcreto();

            IStand myStand1 = myCreador.elaborar(CreadorConcreto.stand_1);
            myStand1.crear();

            IStand myStand2 = myCreador.elaborar(CreadorConcreto.stand_2);
            myStand2.crear();

            IStand myStand3 = myCreador.elaborar(CreadorConcreto.stand_3);
            myStand3.crear();

            IStand myStand4 = myCreador.elaborar(CreadorConcreto.stand_4);
            myStand4.crear();     
    }

}