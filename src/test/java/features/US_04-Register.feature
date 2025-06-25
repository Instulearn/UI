Feature: US_04 Register olma islemleri


  @positiveRegister
  Scenario: Ziyaretci register olma testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  And Register formundaki bütün bilgiler gecerli verilerle doldurulur
  And I agree with terms&rules secilir
  When Signup butonuna tiklanir
  Then Yönlendirilen sayfada Full Name alanina yazilan ismin görüldügü dogrulanir

  @TC_004.1
  Scenario: Register butonu görünürlük testi
  Given Kullanici anasayfaya gider
  Then Register butonunun görünürlügü dogrulanir

  @TC_004.2
  Scenario: Register URL testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  Then Register butonuna tiklandiginda acilan sayfanin URL'inde 'register' kelimesinin yer aldigi dogrulanir

  @TC_004.3
  Scenario: Register page sol taraftaki foto görünürlük testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  Then Sayfanin solunda yer alan resmin görünürlügü dogrulanir

  @TC_004.4
  Scenario: Register page forum görünürlük testi
    Given Kullanici anasayfaya gider
    When Register butona tiklanir
    Then Sayfanin saginda yer alan signup formunun görünürlügü dogrulanir

  @TC_004.5
  Scenario: Register page Account type görünürlük testi
  Given Kullanici anasayfaya gider
  When Register butona tiklanir
  Then Signup formu içerisinde Account type butonlarinin görünürlügü dogrulanir

  @TC_004.6
  Scenario: Register page Account type tiklanabilirlik testi
    Given Kullanici anasayfaya gider
    When Register butona tiklanir
    Then Signup formu içerisinde Account type butonlarinin tiklanabilirligi dogrulanir

  @TC_004.7.8.9.10
  Scenario Outline: Kullanıcı geçersiz veya eksik gerekli alanlarla kayıt olamamali
    Given Kullanici anasayfaya gider
    When Register butona tiklanir
    And Register formu eksik birakilarak doldurulur "<fullName>", "<email>", "<password>", "<retypePassword>"
    And I agree with terms&rules secilir
    And Signup butonuna tiklanir
    Then uyari mesajinin görüntülendigi dogrulanir

    Examples:
      | fullName | email              | password   | retypePassword |
      | Tugba    |                    | abc.12345  | abc.12345      |
      |          | tugba@test.com     | abc.12345  | abc.12345      |
      | Tugba    | tugba@test.com     |            | abc.12345      |
      | Tugba    | tugba@test.com     | abc.12345  |                |

  @TC_004.11
  Scenario: I agree with terms&rules alani secilmediginde cikan uyari mesaji testi
    Given Kullanici anasayfaya gider
    When Register butona tiklanir
    And Register formundaki bütün bilgiler gecerli verilerle doldurulur
    When Signup butonuna tiklanir
    Then I agree with terms&rules alaninin altinda 'The term field is required.' mesajinin yer aldigi dogrulanir

  @TC_004.12
  Scenario Outline: Kullanıcı geçersiz e-mail formatları ile kayıt olamamalı
    Given Kullanici anasayfaya gider
    When Register butona tiklanir
    And Gecerli full name "<fullName>", password "<password>" ve retype password "<retypePassword>" bilgileri girilir
    And Email alanina gecersiz email "<invalidEmail>" girilir
    And I agree with terms&rules secilir
    And Signup butonuna tiklanir
    Then Email alaninin altinda "<errorMessage>" mesajinin yer aldigi dogrulanir
    Then Sayfanin saginda yer alan signup formunun görünürlügü dogrulanir

    Examples:
      | fullName | password   | retypePassword | invalidEmail     | errorMessage                                   |
      | Tugba    | abc.12345  | abc.12345      | tugbatugba.com   | The email must be a valid email address.       |
      | Tugba    | abc.12345  | abc.12345      | tugba@           | The email must be a valid email address.       |
      | Tugba    | abc.12345  | abc.12345      | @tugba.com       | The email must be a valid email address.       |


    @TC_004.13
    Scenario Outline: Kullanıcı 5 haneli password girdiginde dogru uyari mesaji gelmeli
      Given Kullanici anasayfaya gider
      When Register butona tiklanir
      And Email alanina gecerli bir email girilir
      And Full Name alani "<fullName>" gecerli verilerle doldurulur
      And Password alani "<password>" ve Retype Password alani "<retypePassword>" olarak doldurulur
      And I agree with terms&rules secilir
      And Signup butonuna tiklanir
      Then Password altinda "<errorMessage>" uyari mesajinin görüntülendigi dogrulanir

      Examples:
       | fullName | password | retypePassword | errorMessage                                 |
       | Tugba    | abc.1    | abc.1          | The password must be at least 8 characters.  |


