
Feature: US_042 Student olarak toplantılar görüntülenip yönetilir

   @omer
  Scenario: TC_42.1 Student Dashboard'da My reservations linkinin görünürlük testi
    Given kullanıcı login sayfasına gider
    When kullanıcı adı, şifreyi girer ve login butonuna basar
    Then Dasboard sideBarda Meetings linkine tıklar
    Then Açılan menüde My rezervations linkine tıklar ve linki doğrular

    @omer
    Scenario: TC_42.2 Instructor ile görüşme sağlanabilmesi testi
      Given kullanıcı login sayfasına gider
      When kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dasboard sideBarda Meetings linkine tıklar
      Then Açılan menüde My rezervations linkine tıklar
      Then sayfayı aşağıya çeker instructors detay butonuna tıklar
      Then add to calendar butonunun görünürlüğünü doğrular
      And  contact ınstructors butonunun görünürlüğünü doğrular
      Then finished butonunun görünürlüğünü doğrular


