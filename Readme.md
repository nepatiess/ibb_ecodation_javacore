# IBB Ecodation Java Core
[Gıthub](https://github.com/nepatiess/ibb_ecodation_javacore)

---

## ShortCuts
- Single Comment   => Ctrl+/
- Multiple Comment => Shift+Ctrl+/
- Beautify: Ctrl+Alt+l
- Copyand pase: Ctrl+d
- Hepsini değiştir: Shift+F6

---

## Java Common Rules
```sh
Class isimleri PascalCase göre yazılır
Class isimleri: Fiil olarak kullanmayız (mak-mek)
Class : Java 1 tane public class vardır (inner class hariç)
Class : Java static class yoktur (inner class hariç)

Paket isimleri: Küçük harflerle yazılır.
Paket isimleri: fiil olarak kullanmayız (mak-mek)
Paket kısa net bir şekilde olması gerekiyor.

Javada Her biten kelime ; ile bitirmek zorundayız.
```

---

## Java Core Information
```sh
Java case sensitive bir dildir. (Büyük-küçük harflere duyarlı yüksek seviye bir dildir.)
```
---

# Ödevler
# 1. Ders Ödevi (4 Şubat 2025)
## Maven Nedir?
Maven, Java projelerinde bağımlılık yönetimi ve otomasyon sağlayan bir proje yönetim aracıdır. Apache tarafından geliştirilmiştir ve projelerin derlenmesi, test edilmesi, paketlenmesi gibi işlemleri otomatikleştirir.

### Özellikleri
- Bağımlılık yönetimi sağlar (dependencies).
- Proje yapılandırmasını XML tabanlı bir dosya olan pom.xml ile yönetir.
- Build sürecini otomatikleştirir.
- Tek bir komutla (örneğin, mvn clean install) projeyi inşa edebilir.

---

## pom.xml Nedir?
pom.xml (Project Object Model), Maven projelerinde yapılandırma ve bağımlılıkları yöneten dosyadır.

### İçerdiği Bilgiler
- Proje bilgileri (adı, sürümü, geliştiricisi vb.)
- Kullanılan bağımlılıklar
- Build konfigürasyonu
- Eklentiler (plugins)

---

## JDK (Java Development Kİt) Nedir?
JDK, Java ile yazılım geliştirmek için gerekli araçları içeren bir pakettir. JDK olmadan Java kodlarını derleyip çalıştırmak mümkün değildir.

### İçeriği
- JRE (Java Runtime Environment)
- JVM (Java Virtual Machine)
- Java Compiler (javac)
- Java kütüphaneleri ve API’ler

---

## JRE (Java Runtime Environment) Nedir?
JRE, Java programlarını çalıştırmak için gerekli ortamı sağlayan bir bileşendir. JDK’nın bir alt kümesidir. Bir kullanıcı Java ile yazılmış bir programı çalıştırmak istiyorsa, bilgisayarında JRE yüklü olmalıdır. Ancak JRE ile Java kodu yazılamaz ve derlenemez.

### İçeriği
- JVM (Java Virtual Machine)
- Çalışma zamanı kütüphaneleri
- Java sınıfları ve destekleyici dosyalar

### Eğer sadece Java programlarını çalıştırmak istiyorsanız, JDK yerine sadece JRE yükleyebiliriz. Ancak, JRE Java kodu yazmak veya derlemek için yeterli değildir.
---

## Compiler Nedir?
Compiler, Java kaynak kodunu (.java dosyalarını) makine tarafından anlaşılabilir bytecode (.class dosyaları) formatına çeviren derleyicidir. Java'da kullanılan compiler: javac (Java Compiler)
## Örnek
```
javac HelloWorld.java
```
---

## JVM (Java Virtual Machine) Nedir?
JVM, Java programlarını çalıştıran sanal makinedir. Windows, macOS veya Linux fark etmeksizin Java kodu tek bir JVM üzerinde çalıştırılabilir.

### Özellikleri
- Platform bağımsız çalışır.
- Java kodunu bytecode’dan makine koduna çevirir.
- Garbage Collector ile hafıza yönetimini yapar.

---

## Interpreter Nedir?
Interpreter, kaynak kodunu satır satır çalıştıran bir programdır. Java'da:
- Compiler (javac) Java kodunu bytecode’a çevirir.
- Interpreter (JVM içinde) bytecode’u satır satır çalıştırır.

## Örnek
```
System.out.println("Merhaba, Dünya!");
```

JVM, bu kodu bytecode’dan alıp işletim sistemine uygun şekilde çalıştırır.

---

## Java Nedir?
Java, platform bağımsız, nesne yönelimli ve çok amaçlı bir programlama dilidir.

- Platform bağımsızdır: "Write Once, Run Anywhere" (Bir kere yaz, her yerde çalıştır)
- Güvenlidir: Bellek yönetimi ve hata kontrolü içerir.
- Multi-threading destekler: Aynı anda birden fazla işlemi yapabilir.

### Özellikleri
- Platform bağımsızlık – JVM sayesinde her platformda çalışır.
- Nesne yönelimli programlama (OOP) – Class ve Object yapısını kullanır.
- Güçlü bellek yönetimi – Garbage Collector ile gereksiz nesneleri temizler.
- Çoklu iş parçacığı (multi-threading) desteği vardır.
- Güvenlidir – Java, bellek sızıntılarını ve zararlı işlemleri engeller.

---

## Data Types (Veri Türleri) Nedir?
Java’da değişkenlerin alabileceği veri tiplerini belirleyen sınıflandırmadır.

İki temel veri türü vardır:

- Primitive Types (İlkel Veri Tipleri)
- Wrapper Types (Sarmalayıcı Tipler)

### Primitive Types (İlkel Veri Tipleri)
İlkel veri tipleri, doğrudan bellekte yer kaplayan en temel veri tipleridir.

| Veri Tipi | Açıklama | Örnek |
| --------- | -------- | ----- |
| byte | 8 bit, -128 ile 127 arası | byte b = 100; |
| short |	16 bit, -32,768 ile 32,767 arası	| short s = 32000; |
| int	| 32 bit, -2^31 ile 2^31-1 arası	| int i = 12345; |
| long | 64 bit, çok büyük tam sayılar | long l = 1234567890L; |
| float |	32 bit, ondalıklı sayılar |	float f = 12.34f; |
| double	| 64 bit, yüksek hassasiyetli sayılar |	double d = 12.3456789; |
| char | Tek bir karakter (16 bit)	| char c = 'A'; |
| boolean |	true veya false değer alır | boolean isTrue = true; |

### Wrapper Types (Sarmalıyıcı Tipler) Nedir?
Wrapper sınıfları, primitive türleri nesne olarak kullanmayı sağlar.
- Primitive Type → Wrapper Type Dönüşümleri

| Primitive Type | Wrapper Class |
| -------------- | ------------- |
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

## Örnek
```
int primitiveInt = 10;
Integer wrapperInt = primitiveInt;  // Otomatik kutulama (Autoboxing)

Integer wrapperValue = Integer.valueOf(20);
int primitiveValue = wrapperValue;  // Otomatik açma (Unboxing)
```
Wrapper sınıfları, koleksiyonlarla (List, Set, Map) çalışırken faydalıdır çünkü koleksiyonlar yalnızca nesneleri saklayabilir.

## Primitive Types ve Wrapper Types Arasındaki Farklar
| Özellik | Primitive Types | Wrapper Types |
|----------------------|------------------------|------------------------|
| **Tanım**            | Doğrudan değeri saklayan türlerdir. | Primitive türleri sarmalayan sınıflardır. |
| **Hafıza Kullanımı**  | Daha az bellek kullanır, daha verimlidir. | Daha fazla bellek tüketir (ekstra nesne oluşturur). |
| **Depolama**         | Stack bellekte saklanır. | Heap bellekte saklanır (Nesne olarak oluşturulduğu için). |
| **Değer Tipi**       | Değer (value) tipindedir. | Referans (object) tipindedir. |
| **Null Olabilir mi?** | **Hayır** (null olamaz). | **Evet** (null olabilir). |
| **Varsayılan Değer**  | int → 0, double → 0.0, boolean → false vb. | null (eğer nesne oluşturulmamışsa). |
| **Nesne Davranışı**  | Nesne değildir, direkt hesaplama yapar. | Nesnedir, metodları vardır. |
| **Koleksiyonlarda Kullanım** | **Doğrudan kullanılamaz** (List<int> gibi bir şey yazamayız). | **Kullanılabilir** (List<Integer> mümkündür). |
| **Dönüştürme İşlemi** | Boxing & Unboxing gerektirir. | Boxing & Unboxing ile primitive türlere dönüşebilir. |

## Wrapper Type Kullanım Senaryoları
| **Senaryo** | **Primitive Kullanımı** | **Wrapper Kullanımı** |
|------------|--------------------|--------------------|
| **Performans & Bellek** | ✅ Daha hızlı, az bellek kullanır. | ❌ Daha fazla bellek kullanır. |
| **Koleksiyonlarla Kullanım** | ❌ Kullanılamaz. (`List<int>` hata verir) | ✅ Kullanılabilir. (`List<Integer>`) |
| **Null Değer Atama** | ❌ Mümkün değil. | ✅ Mümkün (`Integer x = null;`) |
| **Metot Kullanımı** | ❌ Metotları yoktur. | ✅ `valueOf()`, `parseInt()` gibi metotlar içerir. |
| **Generics (Jenerik Türler)** | ❌ Kullanılamaz (`T extends int` olmaz). | ✅ Kullanılabilir (`T extends Number`). |

---

### 1. Ders Soruları Özeti
- Maven bağımlılık yönetimi ve otomasyonu sağlar.
- JDK, Java kodlarını yazmak ve derlemek için gereklidir.
- JRE, Java uygulamalarını çalıştırmak için gereklidir.
- JVM, Java bytecode’unu makine koduna çevirerek çalıştırır.
- Java, nesne yönelimli, güvenli ve platform bağımsız bir dildir.
- Primitive Types bellekte doğrudan yer kaplayan basit veri türleridir.
- Wrapper Types, primitive türleri nesne olarak kullanmayı sağlar.

---

# 2. Ders Ödevi (6 Şubat 2025)
## camelCase yazım nedir? 
- İlk kelime küçük harfle başlar, sonraki kelimeler büyük harfle başlar.
- Genellikle JavaScript, Java ve C# gibi dillerde kullanılır.
## camelCase
```
string userName
int playerScore
```

---

## PascalCase yazım nedir? 
- Tüm kelimelerin ilk harfi büyük olur.
- Genllikle sınıf (class) isimleri için kullanılır.

## PascalCase
```
class PlayerData{}
class GameManager{}
```

---

## snace_case yazım nedir? 
- Tüm harfler küçük olur, kelimeler alt çizgi (_) ile ayrılır.
- Genellikle Python'da değişken ve fonksiyon isimlendirmede tercih edilir.

## snake_case
```
user_name
player_score
```

---

## kebab-case yazım nedir?
- Tüm harfler küçük olur, kelimeler tire (-) ile ayrılır.
- Genellikle HTML, CSS ve URL yapılarında kullanılır.

## kebab-case
```
<div class = "player-score"></div>
<link rel = "stylesheet" href = "game-style.css">
```

---

## Sorular
```
int number1=10; number1++;
System.out.println(number1);
```
Açıklama: Önce değişkenin değeri kullanılır, sonra artar.
number1=10+1=11 olur
Çıktı: 11

```
int number2=10; ++number2;
System.out.println(number2);
```
Açıklama: Önce değişkenin değeri artılır, sonra kullanılır
number1=10+1=11 olur
Çıktı: 11

---

## Stack Memory - Heap Memory Nedir?
- Stack ve Heap, programların verileri saklamak için kullandığı iki farklı alanı ifade eder.

| Stack Memory | Heap Memory |
| ------------ | ----------- |
| Küçük ve hızlıdır. | Daha büyük ve daha yavaş. |
| Metod çağrıları sırasında kullanılan değişkenler burda saklanır. | Nesneler (objects) burda saklanır. |
| Yerel (local) değişkenler ve metod çağrılarına ait bilgiler burada tutulur. |          |
| LIFO (Last in, first out) prensibiyle çalışır. |    |
| Metot tanımlandığında, ilgili değişkenler bellekten otomatik olarak kaldırılır. | Garbage Collector kullanarak kullanılmayan nesneler temizlenir. | 

``` Stack Memory Örnek
public void example() {
  int x = 10; //Stack'te saklanır.
}
```


``` Heap Memory Örnek
class Player {
  String name; //Heap'te saklanır.
}

Player player1 = new Player(); //player1 nesnesi Heap'te tutulur.
```

---

## Escape Character Nedir?
- Escape karakterlerini, özel karakterleri ekranda göstermek veya belirli işlemleri gerçekleitrmesi için kullanılır. Ters eğik çizgi (\) ile başlar.

### Bazı yaygın escape karakterleri:
| Karakter | Açıklama |
| -------- | -------- |
| \n | Yeni satır |
| \t | Sekme (tab) | 
| \\" | Çift tırnak | 
| \\' | Tek tırnak | 
| \\\ | Ters eğik çizgi | 

---

## Scanner Class Nedir?
- Scanner sınıfı, kullanıcıdan veri almak için kullanılır. Java'da giriş almak için genellikle **System.in** ile birlikte kullanılır.

### Kullanımı
``` 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner nesnesi oluşturulur.
        
        System.out.print("Adınızı girin: ");
        String name = input.nextLine();  // Kullanıcıdan String giriş alınır.
        
        System.out.print("Yaşınızı girin: ");
        int age = input.nextInt();  // Kullanıcıdan int giriş alınır.

        System.out.println("Adınız: " + name);
        System.out.println("Yaşınız: " + age);
        
        input.close();  // Scanner kapatılır.
    }
}
```

- nextInt() : Tam sayı almak için
- nextDouble() : Ondalıklı sayı alamk için
- nextLine() : Bir satır (string) almak için

- Scanner sınıfı, kullanıcıdan veri almak için yaygın olarak kullanılan bir sınıftır.

---

# 3. Ders Ödevi (8 Şubat)
## Stringten'ten int geçerken nasıl çözebiliriz?

``` 
  System.out.println("Bildiğiniz diller veya teknolojiler: ");
        language = klavye.nextInt();
```
  Java'da nextInt() kullanılırken, kullanıcıdan gelen girdinin tam sayı olması gerekir.Ancak "Bildiğiniz diller veya teknolojiler" yazısından dolayı hata verecektir.
  Bunun yerine, kullanıcıdan bir string alıp sonra bir intger'a çevirmek için şu adımlar takip edilebilir:
  
- nextLine() kullanarak string alıp parseInt() ile çevirmek

``` 
  import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: "); 
        String girdi = klavye.nextLine(); // Önce String olarak al
       
        try {
            int sayi = Integer.parseInt(girdi); // String'i int'e çevir
            System.out.println("Girdiğiniz sayı: " + sayi);
        } catch (NumberFormatException e) {
            System.out.println("Hatalı giriş! Lütfen bir sayı giriniz.");
        }
    }
}
```
- nextInt() yerine nextLine() kullanılabilir:

``` 
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);

        System.out.println("Bildiğiniz diller veya teknolojiler: "); 
        String language = klavye.nextLine(); // nextInt() yerine nextLine() kullan

        System.out.println("Girdiğiniz: " + language);
    }
}
```

---


## null değeri ne zaman kullanabilirim?
- Bir nesnenin henüz başlangıç değerinin olmadığını belirtmek için,
``` 
String name = null; // Daha sonra bir değer atanacak
```

- İsteğe bağlı değerler için,
```
Optional<String> optionalName = Optional.ofNullable(null);
```

- Başarısız olan veya sonuç üretmeyen bir meyod dönüşü içim,
```
public String findUserById(int id) {
    if (id == 1) {
        return "Zeynep Koz";
    }
    return null; // Kullanıcı bulunamazsa null döndür
}
```

- Dizilerde veya koleksiyonlarda eksik değerler için,
```
String[] users = new String[3];
users[0] = "Zeynep";
users[1] = null; // Henüz bir kullanıcı atanmadı
users[2] = "Ayşe";
```

- Bellek kullanımını azaltmak için.
```
User user = new User("Zeynep");
user = null; // Garbage Collector tarafından temizlenebilir
```

---
        
# 4. Ders Ödevi (11 Şubat)
## Switch-case, if, else if, else arasındaki farklar nelerdir?

 ### Kullanım Örnekleri:
 - switch-case (Eşitlik karşılaitırmaları için)
   
``` 
int gun = 3;
switch (gun) {
    case 1:
        System.out.println("Pazartesi");
        break;
    case 2:
        System.out.println("Salı");
        break;
    case 3:
        System.out.println("Çarşamba");
        break;
    default:
        System.out.println("Geçersiz Gün");
}
```
✔ Avantajı: Çok sayıda sabit değerli kontrol yaparken daha okunaklıdır.
❌ Dezavantajı: Sadece eşitlik karşılaştırması yapabilir.

- if-else if-else (Her türlü karşılaştırma için)
``` 
int yas = 20;

if (yas < 18) {
    System.out.println("Çocuk");
} else if (yas >= 18 && yas < 65) {
    System.out.println("Yetişkin");
} else {
    System.out.println("Yaşlı");
}
```
✔ Avantajı: Daha karmaşık ve dinamik koşulları işleyebilir.
❌ Dezavantajı: Çok fazla karşılaştırma olduğunda kod karmaşık hale gelebilir.

### Hangisini ne zaman kullanmalıyım:
✅ switch-case kullan:
- Eğer sabit değerler üzerinden karar veriyosan (int, char, string, enum).
- Örneğin, bir menüdeki seçenekleri kontrol etmek veya bir haftanın günlerini belirlemek vb.

✅ if-else if-else kullan:
- Mantıksal karşılaştırmalar (<,>,&&,||) yapman gerekiyorsa.
- Daha esnek koşullar gerekiyorsa
- Örneğin, kullanıcının yaşına, skoruna göre işlem yapmak vb.

---

## for ile while arasındaki fark nelerdir?
| Özellik | for döngüsü | while döngüsü | 
| ------- | ----------- | ------------- |
| Kullanım alanı | Döngü sayısı önceden bliniyosa tercih edilir. | Döngü sayısı önceden bilinmiyorsa kullanılır. |
| Yapı | Başlangıç, koşul ve artırma/azaltma tek satırda yazılır. | Sadece koşul belirtlilir, artma/azalma içerde yapılır. |
| Kod Okunabilirliği | Daha düzenli ve okunaklıdır. | Daha esnektir ama bazen kod karmaşık olabilir. | 
| Sonsuz döngü | for(;;) şeklinde yazılır. | while(true) şeklinde yazılır. | 
| Kullanım esnekliği | Sayaçlı işlemler için daha uygundur. | Koşul dayalı işlemler için daha uuygundur. | 

### Kullanım Örnekleri:

- for döngüsü (Sayaç kontrollü)
``` 
for (int i = 1; i <= 5; i++) {
    System.out.println("Merhaba, döngü " + i + ". kez çalışıyor.");
}
```
✔ Avantajı: Başlangıç, koşul ve artırma/azaltma tek satırda olduğu için daha okunaklıdır.
❌ Dezavantajı: Koşula dayalı çalışması gereken durumlarda esnekliği azalır.

- while döngüsü (koşul kontrollü)
``` 
int sayi = 0;
while (sayi < 5) {
    System.out.println("Sayı: " + sayi);
    sayi++;
}
```
✔ Avantajı: Koşula bağlı olduğu için daha esnek çalışır.
❌ Dezavantajı: Eğer artırma unutulursa, sonsuz döngü oluşabilir.

### Hangisini kullanmalıyım?
| Senaryo | Tercih edilmesi gereken döngü |
| ------- | ----------------------------- |
| Tekrar sayısı belli mi? | for |
| Koşul bazlı mı çalışacak? | while |
| En az bir kez mi çalışmalı? | do-while | 
| Sayaç kullanılacak mı? | for | 

---

## String birleştirme (concatention) türleri nedir? StringBuilder, StringBuffer nedir? 
- + ile birleştirme
  ``` 
  String ad = "Zeynep";
  String soyad = "Koz";
  String tamIsim = ad + " " + soyad; 
  System.out.println(tamIsim); // Çıktı: Zeynep Koz
  ```

✔ Avantajı: Kullanımı basittir.
❌ Dezavantajı: Çok sayıda String birleştirme işlemi yapıldığında performans düşebilir.

- concat() metodu ile birleştirme
```
String s1 = "Java";
String s2 = " Programlama";
String sonuc = s1.concat(s2);
System.out.println(sonuc); // Çıktı: Java Programlama
```
✔ Avantajı: + operatöründen daha açık ve anlaşılır olabilir.
❌ Dezavantajı: null değerlerle işlem yaparken hata verebilir.

- StringBuilder ile birleştirme
``` 
StringBuilder sb = new StringBuilder("Merhaba");
sb.append(" Dünya!");
System.out.println(sb.toString()); // Çıktı: Merhaba Dünya!
```
✔ Avantajı: + operatörüne göre daha performanslıdır (Çünkü String nesneleri immutable'dır, ancak StringBuilder mutable’dır).
❌ Dezavantajı: + veya concat() kadar kısa ve basit değildir.

- StringBuffer ile birleştirme
```
StringBuffer sbf = new StringBuffer("Kod");
sbf.append(" Yazmak");
System.out.println(sbf.toString()); // Çıktı: Kod Yazmak
```
✔ Avantajı: StringBuilder gibi performanslıdır ve aynı zamanda thread-safe çalışır.
❌ Dezavantajı: StringBuilder'a göre biraz daha yavaştır.

- join() ile birleştirme
```
String sonuc = String.join(" - ", "Java", "Python", "C++");
System.out.println(sonuc); // Çıktı: Java - Python - C++
```
✔ Avantajı: Daha düzenli ve okunaklıdır.
❌ Dezavantajı: Java 8 ve üstü sürümlerde çalışır.

- format() ile birleştirme
``` 
String isim = "Zeynep";
int yas = 21;
String sonuc = String.format("Benim adım %s ve %d yaşındayım.", isim, yas);
System.out.println(sonuc); // Çıktı: Benim adım Zeynep ve 21 yaşındayım.
```
✔ Avantajı: Şablon bazlı formatlamalar için uygundur.
❌ Dezavantajı: Küçük işlemler için gereksiz karmaşıklık oluşturabilir.

- Arrays.toString() ile birleştirme
```
import java.util.Arrays;

String[] kelimeler = {"Merhaba", "Dünya", "!"};
String sonuc = Arrays.toString(kelimeler);
System.out.println(sonuc); // Çıktı: [Merhaba, Dünya, !]
```
✔ Avantajı: Dizileri String'e dönüştürmek için uygundur.
❌ Dezavantajı: Çıktıda köşeli parantezler ([ ]) ve virgüller bulunur.

- Collector.joining() ile birleştirme
```
import java.util.List;
import java.util.stream.Collectors;

List<String> liste = List.of("Elma", "Armut", "Muz");
String sonuc = liste.stream().collect(Collectors.joining(", "));

System.out.println(sonuc); // Çıktı: Elma, Armut, Muz
```
✔ Avantajı: Koleksiyonlarla (List, Set, vb.) çalışırken kullanışlıdır.
❌ Dezavantajı: Java 8 ve üstü sürümlerde kullanılabilir.

---

## return, continue, break nedir? Aralarındaki farklar nelerdir?
### Return
- return, bir metodun çalışmasını sonlandırır metod içinde kullanılır.
- Eğer metod bir değer döndürüyorsa, return ile bir değer belirtilmelidir.
- void metotdlarda sadece return; yazarak metodu bitirebiliriz.
- metodun bir değer döndürmesini istiyorsan, metodun çalışmasını erken durdurmak için kullanılır.

### Break
- Break döngüyü veya switch-case bloklarını tamamen sonlandırır.
- Döngüden çıkınca kod akışı devam eder.
- switch-case içinde gereksiz kontorlü önlemek için, bir döngü belirli bir durumda durmalıysa kullanılır.

### continue
- Döngü içindeki kodun geri kalanını çalıştırmadan bir sonraki döngü adımına geçer.
- Belirli bir koşul sağlandığında döngünün o adımını atmlamak için, kullanılır
- Örneğin, belirli sayıları işlem dışı bırakmak için.

### Örnek kod
```
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 2) {
                continue; // 2 atlanır, döngü devam eder.
            }
            if (i == 4) {
                break; // Döngü tamamen sonlanır.
            }
            System.out.println("Sayı: " + i);
        }
        
        System.out.println("Metot çağrılıyor...");
        testReturn();
    }

    public static void testReturn() {
        System.out.println("Bu metot çalışıyor.");
        return; // Metodu sonlandırır.
        // System.out.println("Bu satır çalışmaz!"); (HATA: return sonrası kod çalışmaz)
    }
}
```
### Çıktı
```
Sayı: 1
Sayı: 3
Metot çağrılıyor...
Bu metot çalışıyor.
```

---

## Static yapı nedir?

## Overloading nedir?

## Override nedir?

## Aralarındaki fark nelerdir?
- 1. kod
``` 
String kelime= new String();
```
- 2. kod
``` 
String kelime= "";
```

---

## Aralarındaki fark nedir?
- 1. kod
```
 vocabulary1== vocabulary2 
```
- 2. kod
``` 
  vocabulary1.equals(vocabulary2));
```


# 5. Ders Ödevi (13 Şubat)
## parametre ile argüman arasında farklar nelerdir ?

## Arasındaki fark nedir? 
- 1. kod
```
 Integer.valueOf(cast4String)
```

- 2. kod
``` 
   Integer.parseInt(cast4String)
```

## Neden Java 8 bilmek zorundayım ?


## Java 8 ile gelen özellikler nelerdir ?






