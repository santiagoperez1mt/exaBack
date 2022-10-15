package com.example.demo;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.interfaces.IProductRepository;
import com.example.demo.services.SequenceGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;

@Component
@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    @Autowired
    private IProductRepository productRepository;

    @Autowired
    private SequenceGeneratorService generator;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String...args){
        productRepository.deleteAll();

        Category cat1 = new Category(1L,"Tenis");
        Category cat2 = new Category(2L,"Camisetas");

        List<Product> products = new LinkedList();

        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis negros","Tenis negros", 2000.0,true,50,"https://static.dafiti.com.co/p/adidas-performance-0891-7302821-1-product.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis rosados","Tenis rosados", 2000.0,true,50,"https://sevensevencolombia.vteximg.com.br/arquivos/ids/903398-1200-1629/28720047-0056_1.jpg?v=637756442863870000" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis azules","Tenis azules", 2000.0,true,50,"https://static.dafiti.com.co/p/adidas-performance-0869-2596921-1-product.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis grises","Tenis grises", 2000.0,true,50,"https://contents.mediadecathlon.com/p1419921/k$72b461620e3e5ec61db942355362dd66/tenis-caminar-pw-100-hombre-gris.jpg?&f=800x800" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis blancos","Tenis blancos", 2000.0,true,50,"https://tiendasbranchos.vteximg.com.br/arquivos/ids/412818-1000-1000/MERT-WHB_1.jpg?v=637739171998800000" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis rojos","Tenis rojos", 2000.0,true,50,"https://m.media-amazon.com/images/I/71F1rb8aJ5L._AC_UX625_.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis fluorecentes","Tenis fluorecentes", 2000.0,true,50,"https://m.media-amazon.com/images/I/71X-PQ+8aUL._AC_UX625_.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis amarillos","Tenis amarillos", 2000.0,true,50,"https://m.media-amazon.com/images/I/71OKSFz7PzL._AC_SX625._SX._UX._SY._UY_.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis azul cielo","Tenis azul cielo", 2000.0,true,50,"https://m.media-amazon.com/images/I/81rwK2IQCYL._AC_SX625._SX._UX._SY._UY_.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat1,"Tenis dorados","Tenis dorados", 2000.0,true,50,"https://m.media-amazon.com/images/I/71cF7HAYVnL._AC_SX625._SX._UX._SY._UY_.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta América","Camiseta América", 2000.0,true,50,"https://umbrocol.vteximg.com.br/arquivos/ids/189558-1000-1000/AMERICA-FRONT.jpg?v=637349213646370000" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta selección Colombia visitante","Camiseta selección Colombia visitante", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/724f9e09d8d8423dbf57ae6101216dbc_9366/Camiseta_de_Nino_Visitante_Colombia_22_Rojo_HD8853_01_laydown.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta selección Colombia local","Camiseta selección Colombia local", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/f5beb132085840d28075ae77001384a1_9366/Camiseta_Local_Seleccion_Colombia_Amarillo_HD8847_01_laydown.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta Barcelona","Camiseta Barcelona", 2000.0,true,50,"https://http2.mlstatic.com/D_NQ_NP_2X_733379-MPE31554435446_072019-F.webp" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta Manchester United","Camiseta Manchester United", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/edc50f58129041be80b2ae29011a3119_9366/Camiseta_de_Local_Manchester_United_22-23_Rojo_H64049_01_laydown.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta gris deportiva","Camiseta gris deportiva", 2000.0,true,50,"https://racketball.vteximg.com.br/arquivos/ids/196441-1248-1546/03884-CAMISETA-DEPORTIVA-CON-SESGO-AL-COSTADO-GRIS-AMARILLO-LIMA-HOMBRE-CAMISETAS-RACKETBALL-7701650861050-1.jpg?v=637651562924900000" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta Argentina","Camiseta Argentina", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/0c8aa0b3ebf84785b934ae4b01342e98_9366/Camiseta_Visitante_Nino_Argentina_22_Azul_HF1489_01_laydown.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Camiseta Alemania","Camiseta Alemania", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e86b99181d5c4bb89d53ae96009ae5a1_9366/Camiseta_Uniforme_de_Local_Alemania_22_Blanco_HF1467_01_laydown.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Maillot de ciclismo celeste femenino","Maillot de ciclismo celeste femenino", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/113988e317b24110ac08add800c59fc0_9366/Maillot_de_Ciclismo_The_Letras_Manga_Corta_Blanco_HF9588_21_model.jpg" ));
        products.add(new Product(generator.generateSequence(Product.SEQUENCE_NAME),cat2,"Maillot de ciclismo multicolor femenino","Maillot de ciclismo multicolor femenino", 2000.0,true,50,"https://assets.adidas.com/images/h_840,f_auto,q_auto,fl_lossy,c_fill,g_auto/e7472fad07474c90ac8bae4e00ffc3e8_9366/Maillot_de_Ciclismo_The_Letras_Manga_Corta_Amarillo_HI6856_21_model.jpg" ));
        productRepository.saveAll(products);
    }
}
