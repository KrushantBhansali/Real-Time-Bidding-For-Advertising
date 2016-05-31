/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package business.Exchange;

/**
 *
 * @author Krush
 */
public class AdSpace  {
    
    private String position;
    private String availStatus;
    private int price;
    private String publisherName;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvailStatus() {
        return availStatus;
    }

    public void setAvailStatus(String availStatus) {
        this.availStatus = availStatus;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }
    
      public enum AdSpaceType{
        TopRight("TopRight"),
        RightBottom("RightBottom"),
        Center("Center"),
        LeftBottom("LeftBottom");
        
        private String value;
        
        private AdSpaceType(String value){
            this.value = value;
        }
        
        public String getValue(){
            return value;
        }
        
        
    }

    @Override
    public String toString() {
        return position ;
    }
    
    
    
    
}
