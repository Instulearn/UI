Feature: US003 Body Bolumu Basliklari

  @us003
 Scenario: TC_003.1 Ana Sayfa Baslik

    * kullanıcı anasayfaya gider
    * kullanıcı header bölümündeki ‘Home’ butonuna tıklar. anasayfaya gider.
   @us003

   Scenario: TC_003.2 Anasayfa body bolumunde search box gorunur ve aktif olmalı
     * Kullanici anasayfaya gider
      When search box kutusunun olup olmadıgını kontrol eder.
     Then Search box kutusuna tıklanır.

   @us003
    * kullanici anasayfaya gider
       Then Search butonu gorunur  olmalı.
       And Search butonu aktif olmalı




