package rev.oop_rev;

public class BoxPrice extends BoxWeight{
    double price;
    BoxPrice(double l , double h , double w , double weight , double price){
        super(l,h,w,weight);
        this.price = price;
    }
}
