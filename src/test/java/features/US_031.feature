
  Feature: US_031 Dashboard sayfasında profil bilgileri görüntülenip yönetilir

    @omer
    Scenario: TC_31.1 Dashboard sidebar'da Settings linkinin aktiflik testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then İlgili sayfanın açıldığını doğrular

    Scenario: TC_31.2 Basic Information başlığı altındaki form bilgileri düzenleme testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then account başlığı altındaki password text box'ına tıklar ve şifre girilir
      And account başlığı altındaki phone text box'ına tıklar ve şifre girilir
      Then sayfa aşağıya kaydırılır ve next butonuna tıklanır

    Scenario: TC_31.3 Images başlığı altındaki bilgileri düzenleme testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then images link butona tıklanır
      And sayfa aşağıya kaydırılır ve next butonuna tıklanır

    Scenario:  TC_31.4 About başlığı altındaki bilgileri düzenleme testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then about link butona tıklanır
      And biography text box'a biyografi girilir
      Then job title text box'a meslek girilir
      Then next butonuna tıklanır

    Scenario: TC_31.5 Education başlığı altındaki bilgilerin düzenlenme testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then education link butona tıklar
      And  add education butona tıklar
      Then new education tex box'ına ilgili veriyi girer
      Then new education sayfasındaki save butonuna basar
      Then next butonuna tıklanır

    Scenario: TC_31.6 Experience başlığı altında yeni experience eklenebilmesi testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then experience link butona tıklanır
      Then add experience butonunun görünür olduğunu doğrular
      Then next butonuna tıklanır

    Scenario:  TC_31.7 Skills başlığı altında yeni skills eklenebilmesi testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then skill topics link butona tıklanır
      Then SDET(Software Development Engineer in Test) butona tıklanır
      And sayfa aşağıya kaydırılır ve next butonuna tıklanır

    Scenario:  TC_31.8 Identity & financial başlığı altında hesap tanımlama işlemi yapılabilmesi testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then Identity & Financial link butona tıklanır
      Then Select account type check box'ından paypal seçilir
      And  account holder text box'ına ilgili data girilir
      Then email text box'ına ilgili data girilir
      Then sayfa aşağıya çekilir
      Then adress text box'ına ilgili data girilir
      Then next butonuna tıklanır

    Scenario:  TC_31.9  Zoom API başlığı altında zoom hesabının tanımlanabilmesi testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then Zoom API link butona tıklanır
      Then Zoom Client ID ye ilgili data girilir
      And  Zoom Client Secret ilgili data girilir
      Then Zoom Account ID ye ilgili data girilir
      And sayfa aşağıya kaydırılır ve next butonuna tıklanır

    Scenario:  TC_31.10  Extra Information başlığı altında ki bilgileri düzenleme testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then Extra Information link butona tıklanır
      Then Gender başlığı altında male butonu seçilir
      Then Age text box'ına ilgili data girilir
      And  Meeting Type başlığı altındaki All butonu seçilir
      Then Training level başlığı altında ki Advanced butonu seçilir
      Then Region başlığı altında ki Country United States seçilir
      And sayfa aşağıya kaydırılır ve save butonuna tıklanır

    Scenario:  TC_31.11 Oluşturulan hesabın silinebilmesi testi
      Given kullanıcı login sayfasına gider
      When instructor kullanıcı adı, şifreyi girer ve login butonuna basar
      Then Dashboard sideBar aşağıya çekilir
      Then Settings linkine tıklanır
      Then sayfa aşağıya çekilir
      Then sayfanın sağ alt köşesindeki Delete Account butonuna tıklanır
      And  çıkan uyarı sayfasında ki Yes, I Confirm butonuna tıklanır
      Then Hesabın silindiğini doğrulayan bilgilendirme sayfasından, sayfanın herhangi bir yere tıklanarak çıkılır


