Feature: Instructor giriş bölümü kontrolü

  Scenario: TC1 - Anasayfada 'Home - Join as instructor' başlığı görünür ve aktif olmalıdır
    Given Kullanıcı anasayfaya gider
    Then Home - Join as instructor başlığı görünür ve aktif olmalıdır

  Scenario: TC2 - Join as instructor linkine tıklandığında Login sayfasına yönlendirilmelidir
    Given Kullanıcı anasayfaya gider
    When Kullanıcı 'Join as instructor' linkine tıklar
    Then Kullanıcı Login sayfasına yönlendirilmelidir
