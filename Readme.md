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

# Ödevler
# 1. Ders Ödev (4 Şubat 2025)
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

---

### 1. Ders Soruları Özeti
- Maven bağımlılık yönetimi ve otomasyonu sağlar.
- JDK, Java kodlarını yazmak ve derlemek için gereklidir.
- JRE, Java uygulamalarını çalıştırmak için gereklidir.
- JVM, Java bytecode’unu makine koduna çevirerek çalıştırır.
- Java, nesne yönelimli, güvenli ve platform bağımsız bir dildir.
- Primitive Types bellekte doğrudan yer kaplayan basit veri türleridir.
- Wrapper Types, primitive türleri nesne olarak kullanmayı sağlar.

# 2. Ders Ödev (6 Şubat 2025)
## camelCase yazım nedir? 


## PascalCase yazım nedir? 


## snace_case yazım nedir? 


## kebab-case yazım nedir?













