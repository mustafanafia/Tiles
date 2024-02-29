public class Tile {


    private int value;
    private String color;
    
    public Tile() { 
      color = "NO COLOR";
      value = 0;
    
    }

        
    public Tile (String color, int value) {
        if (color == "Blue" || color == "Black" || color == "Red" || color == "Yellow"){
        this.color = color;
        
        if (value >= 1 && value <= 14) 
            
        this.value = value;
        
        if (value == 14) {
               this.color = "Black";
               this.color = "Red";

            }
        }
    }


    public String getColor() { 
    return color; 
}
    public void setColor(String Color){
        this.color = color;
    }
    public int getValue() {
        return value; 
    }
    public void setValue(int value) {
        this.value = value; 
    }
    
    public void tradeTiles(String color, int value) {
        return;
    }
    
    public String toString(){
        return "The color is: " + (color) + "Value: " + (value);
    }
}

   
    
