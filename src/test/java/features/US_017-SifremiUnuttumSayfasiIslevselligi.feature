Feature: US_017 - Sifremi Unuttum sayfası islevselligi


  Scenario: Forgot your password linki login sayfasında görünür ve aktif olmalı
    Given Kullanıcı login sayfasına gider
    Then "Forgot your password?" linki görünür olmalı
    And Link aktif olmalı
    When Kullanıcı bu linke tıklar
    Then Kullanıcı forget-password sayfasına yönlendirilir

  Scenario: Forget-password sayfasında Password Recovery yazısı görünmeli
    Given Kullanıcı forget-password sayfasındadır
    Then Sayfada "Password Recovery" yazısı görünmelidir

  Scenario: Email textbox görünür ve aktif olmalı
    Given Kullanıcı forget-password sayfasındadır
    Then Email giriş alanı görünür olmalı
    And Email giriş alanı aktif olmalı

  Scenario: Geçerli e-mail ile reset işlemi başarılı olmalı
    Given Kullanıcı forget-password sayfasındadır
    When Kayıtlı bir email adresi girer
    And Reset Password butonuna tıklar
    Then "Request done successfully!" mesajı görünmelidir

  Scenario: Reset Password butonu görünür ve aktif olmalı
    Given Kullanıcı forget-password sayfasındadır
    Then Reset Password butonu görünür olmalı
    And Buton aktif olmalı

  Scenario: Kullanıcı login sayfasına geri dönebilmeli
    Given Kullanıcı forget-password sayfasındadır
    When Kullanıcı login sayfasına dön linkine tıklar
    Then Login sayfasına yönlendirilmelidir