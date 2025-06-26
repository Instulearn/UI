Feature: US_018 - Footer bölümü işlemleri

  Scenario: Ana sayfada footer bölümü görüntülenebilmelidir
    Given Kullanıcı ana sayfaya gider
    Then Footer bölümü görünür olmalıdır

  Scenario: Footer bolumunde faydali linkler gorunebilmeli ve aktif olmali
    Given Kullanıcı ana sayfaya gider
    Then Footer içindeki "About us" linki görünür ve aktif olmalıdır
    And Footer içindeki "Contact us" linki görünür ve aktif olmalıdır
    And Footer içindeki "Certificate validation" linki görünür ve aktif olmalıdır
    And Footer içindeki "Terms & rules" linki görünür ve aktif olmalıdır

  Scenario: Footer bölümünde mail ve telefon bilgileri görünür olmalıdır
    Given Kullanıcı ana sayfaya gider
    Then Footer'da mail bilgisi görünür olmalıdır
    And Footer'da telefon bilgisi görünür olmalıdır

  Scenario: Footer'daki subscriber bölümünden bültenlere abone olunabilmelidir
    Given Kullanıcı ana sayfaya gider
    When Kullanıcı footer'daki subscriber alanına geçerli bir email girer
    And Abone ol butonuna tıklar
    Then Abone olunduğuna dair başarı mesajı görünür olmalıdır


    Scenario: Sosyal medya ikonları görünür ve aktif olmalıdır
    Given Kullanıcı ana sayfaya gider
    Then "Twitter" ikonu görünür ve aktif olmalıdır
    And "WhatsApp" ikonu görünür ve aktif olmalıdır
    And "Instagram" ikonu görünür ve aktif olmalıdır
    And "Facebook" ikonu görünür ve aktif olmalıdır

  Scenario: Footer bölümünde hak metni görünür olmalıdır
    Given Kullanıcı ana sayfaya gider
    Then Footer'da "All rights are reserved for learning management system platform" metni görünür olmalıdır

  Scenario: Footer'dan ana sayfanın en üstüne hızlı erişim sağlanabilmelidir
    Given Kullanıcı ana sayfaya gider
    When Footer'daki logo linkine tıklar
    Then Kullanıcı sayfanın en üstüne yönlendirilmelidir