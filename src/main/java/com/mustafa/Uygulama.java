package com.mustafa;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Uygulama {

    List<Film> filmler;
    Scanner scanner=new Scanner(System.in);

    public void baslangicVerisiOlustur() {
        Yonetmen yonetmen1 = new Yonetmen("Miyazaki", "Japonya");
        Film film1 = new Film("Ruhların Kaçışı", LocalDate.of(2001, 10, 10), 5000000, ETur.ANIME, yonetmen1, 9.5);
        Film film2 = new Film("Rüzgarlı Vadi", LocalDate.of(1984, 06, 8), 1000000, ETur.ANIME, yonetmen1, 9.1);
        Film film3 = new Film("Prenses Mononoke", LocalDate.of(1997, 10, 10), 30000000, ETur.ANIME, yonetmen1, 9.6);
        Film film4 = new Film("Yürüyen Sato", LocalDate.of(2004, 10, 10), 1000000, ETur.ANIME, yonetmen1, 8.7);

        Yonetmen yonetmen2 = new Yonetmen("Reha Erdem", "Türkiye");
        Film film5 = new Film("Kaç Para Kaç", LocalDate.of(1999, 10, 10), 100000, ETur.DRAMA, yonetmen2, 7.5);
        Film film6 = new Film("Korkuyorum Anne", LocalDate.of(2004, 06, 8), 300000, ETur.KARAMIZAH, yonetmen2, 8.1);
        Film film7 = new Film("Kosmos", LocalDate.of(2009, 12, 12), 500000, ETur.DRAMA, yonetmen2, 8.6);
        Film film8 = new Film("Seni Buldum Ya", LocalDate.of(2021, 12, 12), 400000, ETur.KARAMIZAH, yonetmen2, 7.2);

        Yonetmen yonetmen3 = new Yonetmen("David Fincher", "Amerika");
        Film film9 = new Film("Seven", LocalDate.of(1995, 10, 10), 2500000, ETur.DRAMA, yonetmen3, 8.8);
        Film film10 = new Film("Dövüş Kulübü", LocalDate.of(1999, 06, 8), 2500000, ETur.AKSIYON, yonetmen3, 9.4);
        Film film11 = new Film("Zodiac", LocalDate.of(2007, 11, 20), 800000, ETur.GERILIM, yonetmen3, 7.8);
        Film film12 = new Film("Gone Girl", LocalDate.of(2014, 10, 10), 1500000, ETur.DRAMA, yonetmen3, 8.2);
        Film film13 = new Film("Mank", LocalDate.of(2020, 12, 12), 2000000, ETur.DRAMA, yonetmen3, 8.4);

        Yonetmen yonetmen4 = new Yonetmen("Cohens", "Amerika");
        Film film14 = new Film("Barton Fink", LocalDate.of(1991, 12, 12), 500000, ETur.GERILIM, yonetmen4, 8.5);
        Film film15 = new Film("Fargo", LocalDate.of(1996, 12, 12), 800000, ETur.GERILIM, yonetmen4, 8.1);
        Film film16 = new Film("Big Lebowski", LocalDate.of(1998, 12, 12), 1100000, ETur.KARAMIZAH, yonetmen4, 9.2);
        Film film17 = new Film("Nerdesin Be Birader", LocalDate.of(2000, 02, 2), 1500000, ETur.KARAMIZAH, yonetmen4, 7.8);
        Film film18 = new Film("Orada Olmayan Adam", LocalDate.of(2001, 7, 17), 500000, ETur.GERILIM, yonetmen4, 8.3);
        Film film19 = new Film("İhtiyarlara Yer Yok", LocalDate.of(2007, 7, 17), 1700000, ETur.DRAMA, yonetmen4, 9.3);
        Film film20 = new Film("Ciddi Bir Adam", LocalDate.of(2009, 7, 17), 500000, ETur.KARAMIZAH, yonetmen4, 8.0);

        Yonetmen yonetmen5 = new Yonetmen("Emin Alper", "Türkiye");
        Film film21 = new Film("Tepenin Ardı", LocalDate.of(2012, 7, 17), 50000, ETur.DRAMA, yonetmen5, 7.7);
        Film film22 = new Film("Kız Kardeşler", LocalDate.of(2019, 7, 17), 400000, ETur.DRAMA, yonetmen5, 8.5);
        Film film23 = new Film("Kurak Günler", LocalDate.of(2022, 7, 17), 600000, ETur.DRAMA, yonetmen5, 8.4);

        Yonetmen yonetmen6 = new Yonetmen("Wes Anderson", "Amerika");
        Film film24 = new Film("Yaman Tilki", LocalDate.of(2009, 7, 17), 900000, ETur.ANIMASYON, yonetmen6, 7.8);
        Film film25 = new Film("Moonrise Kingdom", LocalDate.of(2012, 7, 17), 8500000, ETur.FANTASTIK, yonetmen6, 8.6);
        Film film26 = new Film("Büyük Budapeşte Oteli", LocalDate.of(2014, 7, 17), 1200000, ETur.FANTASTIK, yonetmen6, 9.0);
        Film film27 = new Film("Köpek Adası", LocalDate.of(2018, 7, 17), 1500000, ETur.ANIMASYON, yonetmen6, 9.2);
        filmler =new ArrayList<>( List.of(
                film1, film2, film3, film4, film5, film6, film7, film8, film9, film10,
                film11, film12, film13, film14, film15, film16, film17, film18, film19, film20,
                film21, film22, film23, film24, film25, film26, film27
        ));
    }

    /*
        puanları 8 den buyuk olan filmleri bir setde toplayalım
        puanları 8 den buyuk olan filmlerin yonetmen isimlerini bir setde toplayalım
     */
    public void yuksekPuanlilar(){
      Set<Film> yuksekPuanlifilmler=filmler.stream().filter(f->f.getPuan()>8.0).collect(Collectors.toSet());
        System.out.println("Filmler");
      yuksekPuanlifilmler.forEach(System.out::println);
     Set<String> yuksekPuanliYonetmenler=filmler.stream()
             .filter(f->f.getPuan()>8.0)
             .map(f->f.getYonetmen().getIsim())
             .collect(Collectors.toSet());
        System.out.println("isimler");
        System.out.println(yuksekPuanliYonetmenler);
    }

    /*
        dışarıdan bir ulke ismi alan bir metot yazalım bu metot bize o ulkedeki yonetmenleri bir listede toplasın

     */
    public void ulkeyeGoreYonetmenler(String ulke){
        List<Yonetmen> yonetmenler=filmler.stream()
                .map(Film::getYonetmen).distinct()
                .filter(y->y.getUlke().equalsIgnoreCase(ulke))
                .collect(Collectors.toList());
        yonetmenler.forEach(System.out::println);
        System.out.println("////////////////");
 filmler.stream()
            .filter(f->f.getYonetmen().getUlke().equalsIgnoreCase(ulke))
            .map(x->x.getYonetmen()).distinct()
            .forEach(System.out::println);
        System.out.println("////////////////");
//        filmler.stream()
//                .filter(f->f.getYonetmen().getUlke().equalsIgnoreCase(ulke))
//                .forEach(x-> System.out.println(x.getYonetmen()));

    }

    /*
    hasılatı en yuksek filmi bulalım
     */

    public void enYuksekHasilatliFim(){
        Optional<Film> film = filmler.stream().max(Comparator.comparingLong(x -> x.getHasilat()));
        Optional<Film>  film2=filmler.stream().max(Comparator.comparingLong(Film::getHasilat));
        Optional<Film>  film3=filmler.stream().max((x,y)-> (int) (x.getHasilat()-y.getHasilat()));
        System.out.println(film);
        System.out.println(film2);
        System.out.println(film2);
    }

    /*
    film turlerine gore filmleri tutalım
     */
    public void filmTurlerineGoreFilmler(){
            Map<ETur,List<Film>> map=filmler.stream().collect(Collectors.groupingBy(x->x.getTur()));
            map.entrySet().forEach(System.out::println);
    }
    /*
    her turdeki en yuksek hasılatlı filmi eslestirelim
     */
    public void filmTurlerineGoreHasilatiEnyuksekFilm(){
//        Map<ETur,Film> map2=filmler.stream().collect(Collectors.toMap(x->x.getTur(),
//                v->{
//            return filmler.stream().filter(f->f.getTur().equals(v.getTur())).max(Comparator.comparingLong(Film::getHasilat)).get();
//        }));

        Map<ETur,Optional<Film>> map=filmler.stream().collect(
                Collectors.groupingBy(x->x.getTur(),
                        Collectors.maxBy(Comparator.comparingLong(Film::getHasilat))));

        map.entrySet().forEach(System.out::println);
    }


    /**
     *  1-Filmleri puana göre sıralama ve ilk 5'i alma:
     */
    public void puanaGoreSiralailk5iAl(){
        List<Double> ilk5Film = filmler.stream().map(Film::getPuan)
                .sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
        ilk5Film.forEach(System.out::println);
    }

    /**
     *  2-Belirli bir türdeki filmlerin ortalama puanını bulma:(dışarıdan girilen bir filmin)
     */
    public void belirliTurdekiFilmlerinOrtalamaPuani(ETur tur){
        double sonuc = filmler.stream().filter(x -> x.getTur().equals(tur)).mapToDouble(y -> y.getPuan()).average().getAsDouble();
        System.out.println(sonuc);
    }

    /**
     *  3-Filmlerin türlerini sıralayarak listeleme:
     */
    public void turleriSiralayarakListele(){
        List<ETur> list = filmler.stream().map(Film::getTur).sorted().collect(Collectors.toList());
        System.out.println(list);
    }

    /**
     *  4-Belirli bir hasılat aralığındaki filmleri listeleme
     */
    public void belirliHasilatAraligindakiFilmler(Long hasilat1,Long hasilat2){
        List<Film> list = filmler.stream().filter(x -> x.getHasilat() > hasilat1 && x.getHasilat() < hasilat2).collect(Collectors.toList());
        System.out.println(hasilat1+" ile "+hasilat2+" hasilat arasındaki filmler..:"+list);
    }

//    /**
//     * 5-Yönetmenlerin isimlerini ve ülkelerini eşleştirme:
//     */
//    public void yonetmenlerIleFilmleri(){
//        Map<Yonetmen,List<String>> map = filmler.stream().collect(Collectors.toMap(Yonetmen::getIsim,Yonetmen::getUlke));
//        map.forEach((k,v)-> System.out.println(k+"-->"+v));
//    }

//    /**
//     * 6-Bir ülkede en çok film çeken yönetmen
//     */
//    public void ulkedeEnCokFilmCekenYonetmen(){
//        filmler.stream().map(x->x.getYonetmen().getUlke())
//    }

    /**
     * 7-Animasyon türündeki filmlerin toplam hasılatı
     */

    public void animasyonFilmlerininToplamHasilati(){
        long toplam = filmler.stream().filter(x->x.getTur().equals(ETur.ANIMASYON)).mapToInt(x-> (int) x.getHasilat()).sum();
        System.out.println("Animasyon türündeki filmlerin toplam hasılatı = "+toplam);
    }

    /**
     *  8-Bir yönetmenin film sayısını bulma
     */

    public void yonetmeninFilmSayisi(String yonetmen){
        List<String> sonuc = filmler.stream().filter(x->x.getYonetmen().getIsim().equalsIgnoreCase(yonetmen)).map(y->y.getIsim()).collect(Collectors.toList());
        System.out.println("yonetmenin film sayısı= "+sonuc.size());
    }

//    /**
//     *  9-Belirli bir ülkeden gelen yönetmenlerin film sayılarını yönetmenismine gore mapleme(dısrıdan ulke ismi alınacak)
//     */
//    public void ulkeyeGoreYonetmenlerinFilmSayilari(String ulke){
//        filmler.stream().filter(x->x.getYonetmen().getUlke().equalsIgnoreCase(ulke)).map(y->y.getIsim()).collect(Collectors.toList());
//    }

    /**
     * 10-Toplam hasılatı en yüksek olan belirli bir ülkedeki yönetmenin ismini bulmak için bir Stream ifadesi yazınız
     */
    









    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
        uygulama.baslangicVerisiOlustur();
        //uygulama.yuksekPuanlilar();
       // uygulama.ulkeyeGoreYonetmenler("Türkiye");
       // uygulama.enYuksekHasilatliFim();
        //uygulama.filmTurlerineGoreFilmler();
//        uygulama.filmTurlerineGoreHasılatiEnyuksekFilm();
        uygulama.puanaGoreSiralailk5iAl();
        System.out.println("---");
//        uygulama.belirliTurdekiFilmlerinOrtalamaPuani(ETur.AKSIYON);
        uygulama.turleriSiralayarakListele();
        uygulama.belirliHasilatAraligindakiFilmler(500000L,1000000L);
//        uygulama.yonetmenlerIleFilmleri();
        uygulama.animasyonFilmlerininToplamHasilati();
        uygulama.yonetmeninFilmSayisi("David Fincher");



    }// main sonu



}// class sonu
