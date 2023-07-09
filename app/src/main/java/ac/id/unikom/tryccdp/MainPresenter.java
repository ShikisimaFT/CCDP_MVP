package ac.id.unikom.tryccdp;

public class MainPresenter {
        private MainView view;

        public  MainPresenter(MainView view){
                this.view = view;
        }

        public  void calculate(String celsius){
                if(celsius.isEmpty()){
                        celsius = "0";
                }

                Celsius model = new Celsius();
                model.setCelsius(Double.parseDouble(celsius));

                String fahrenheit = model.toFahrenheit() + "";
                String reamur = model.toReamur() + "";

                view.showFahrenheit(fahrenheit);
                view.showReamur(reamur);
        }
}
