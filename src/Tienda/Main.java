package Tienda;
public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Agregar productos electrónicos
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        
        // Agregar accesorios
        store.addProduct(new Accessory("Mouse", 30.0));
        store.addProduct(new Accessory("Keyboard", 70.0));
        
        // Aplicar un descuento del 10%
        Discountable tenPercentDiscount = product -> product.getPrice() * 0.9;
        store.applyDiscount(tenPercentDiscount);
        
        // Aplicar un descuento fijo de $50
        Discountable fiftyDollarsDiscount = product -> product.getPrice() - 50.0;
        store.applyDiscount(fiftyDollarsDiscount);
        
        // Aplicar un descuento del 15% solo a accesorios
        Discountable fifteenPercentAccessoryDiscount = product -> {
            if (product instanceof Accessory) {
                return product.getPrice() * 0.85;
            }
            return product.getPrice();
        };
        store.applyDiscount(fifteenPercentAccessoryDiscount);
        
        // Aplicar un descuento combinado: 20% de descuento más $10
        Discountable combinedDiscount = product -> {
            Double discountedPrice = product.getPrice() * 0.8; // 20% de descuento
            return discountedPrice - 10.0; // Luego aplicamos $10 de descuento
        };
        store.applyDiscount(combinedDiscount);
    }
}

