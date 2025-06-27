Feature: Kullanici Logout islemleri

  Background:
    Given Kullanici "busra.teacher1@instulearn.com" ve "Busra.1469" ile login olur

  Scenario: Dashboard sayfasinda Logout linki görünür ve aktif olmalidir
    Then Dashboard sayfasinda Logout linki görünür olmalidir
    And Logout linki aktif olmalidir

  Scenario: Dashboard sayfasindan Logout yapilabilmelidir
    When Kullanici Dashboard sayfasinda Logout linkine tiklar
    Then Kullanici basariyla logout olur ve login sayfasina yönlendirilir

  Scenario: Anasayfada profil ikonuna tiklandiginda Logout linki görünmelidir
    When Kullanici anasayfaya gider
    And Kullanici profil ikonuna tiklar
    Then Anasayfa profil menüsünde Logout linki görünür ve aktif olmalidir

  Scenario: Anasayfa profil ikonundan Logout islemi yapilabilmelidir
    When Kullanici anasayfaya gider
    And Kullanici profil ikonuna tiklar
    And Kullanici profil menusunden Logout linkine tiklar
    Then Kullanici basariyla logout olur ve login sayfasina yönlendirilir
