Feature: US_035 Kayıtlı bir kullanıcı olarak sitenin anasayfasında Urunleri görebilmek ve
  urun satın alabilmek için  bir sayfa olmasını istiyorum

  @WIP_35
  Scenario: TC_35.1 Bir Student'ın anasayfada 'Store' linki görünür ve aktif olduğunun testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonunun görünür olduğunu doğrular.

  @WIP_LE_35
  Scenario: TC_35.2 Bir Student'ın anasayfada store linkine tıkladığında text (Products) görüntülenmesi testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonuna tıklar
    * Kullanıcı products sayfasına eriştiğini doğrular

  @WIP_LE_35
  Scenario: TC_35.3 Bir Student'ın Products sayfasında search textBox ve search butonun görünür ve aktif olduğunu
  doğrulama testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonuna tıklar
    * Kullanıcı Search textBox ve search butonunun görünür ve aktif olduğunu doğrular

  @WIP_LE_35
  Scenario: TC_35.4 Bir student'ın products sayfasında ürün seçmeden önce filtreleme işlemleri yapabilmesinin testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonuna tıklar
    * Kullanıcı Search textBox ve search butonunun görünür ve aktif olduğunu doğrular
    * Kullanıcı options filtreleme bölümünden only avaliable products ile filtreleme işlemi gerçekleştirir.

  @WIP_LE_35
  Scenario: TC_35.5 Bir student'ın products sayfasında seçilen ürünlerin fiyat , satıcı, ürün adı,
  description bilgilerinin görünür olması testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonuna tıklar
    * Kullanıcı Search textBox ve search butonunun görünür ve aktif olduğunu doğrular
    * Kullanıcı options filtreleme bölümünden only avaliable products ile filtreleme işlemi gerçekleştirir.
    * Filtrelenen ilk ürünün fiyat , satıcı, ürün adı, description bilgilerinin olması

  @WIP_LE_35
  Scenario: TC_35.6 Bir student'ın istenen ürün seçtiğinde kurs sayfasına yönlendirme yapması, add to card
  ve buy now butonlarının görünür ve aktif olması, ürünler ilgili detaylı bilgiler görüntülenmesi, ürün ile ilgili
  yorum yapılabilmesi testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonuna tıklar
    * Kullanıcı Search textBox ve search butonunun görünür ve aktif olduğunu doğrular
    * Kullanıcı options filtreleme bölümünden only avaliable products ile filtreleme işlemi gerçekleştirir.
    * Filtrelenen ilk ürüne tıklar.
    * Comments linki tıklanmalı, yorum yazılmalı ve post comment butonuna tıklanmalıdır.

  @WIP_LE_35
  Scenario: TC_35.7 Bir Stundent'ın ürünü satın alma işlemi başarıyla gerçekleşme testi

    * Kullanıcı ana sayfaya gider
    * Kullanıcı login butonuna tıklar
    * Kullanıcı "lutfi.student@instulearn.com" ve "Learn.1406" ile login olur
    * Kullanıcı headerdaki Home butonuna tıklar ve ana sayfaya gider
    * Kullanıcı anasayfadaki store butonuna tıklar
    * Kullanıcı Search textBox ve search butonunun görünür ve aktif olduğunu doğrular
    * Kullanıcı options filtreleme bölümünden only avaliable products ile filtreleme işlemi gerçekleştirir.
    * Filtrelenen ilk ürüne tıklar.
    * Buy now butonuna tıklar

