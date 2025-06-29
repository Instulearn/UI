Feature: US_005-Kullanıcının login olması

  @us005
  Scenario: TC_005.1 Ana sayfa ust barinda Login linki gorunur ve aktif olmali.

    * kullanıcı login sayfasına gider
    * login butonuna tıklar ve loginUrl sayfasına yönlendirilir
    @us005
    Scenario: TC_005.2 Login sayfasinin sol bolumunde ilgili resim gorunur olmali.
    * kullanıcı login sayfasına gider
    * images link butona tıklanır

      @us005

      Scenario: TC_005.3 Login Sayfası Görünürlük Testi
        Given Kullanıcı login sayfasına gider
        Then Sağ bölümde login formu görünür olmalı
        And 'Log in to your account' metni görünür olmalı

        @us005

        Scenario: TC_005.4 Login form içinde email ve password textboxlar görünür ve aktif olmalı
          * kullanıcı login sayfasına gider
          Given Kullanıcı login sayfasına gider
          Then Sağ bölümde login formu görünür olmalı
          And 'Log in to your account' metni görünür olmalı
          And Email textbox görünür ve aktif olmalı
          And Password textbox görünür ve aktif olmalı

          @us005
          Scenario: TC_005.5 Login formundaki tüm elemanlar görünür ve aktif olmalı
            Given Kullanıcı login sayfasına gider
            Then Sağ bölümde login formu görünür olmalı
            And 'Log in to your account' metni görünür olmalı
            And Email textbox görünür ve aktif olmalı
            And Password textbox görünür ve aktif olmalı
            And Login butonu görünür ve aktif olmalı
            @us005

            Scenario: Forgot your password linki doğru sayfaya yönlendirmeli
              Given Kullanıcı login sayfasına gider
              When Kullanıcı "Forgot your password?" linkine tıklar
              Then Şifre sıfırlama sayfasına yönlendirilmiş olmalı

  Scenario: Register linki doğru sayfaya yönlendirmeli
    Given Kullanıcı login sayfasına gider
    When Kullanıcı "Register" linkine tıklar
    Then Kayıt olma sayfasına yönlendirilmiş olmalı

  Scenario: Geçersiz bilgilerle giriş yapıldığında hata mesajı görüntülenmeli
    Given Kullanıcı login sayfasına gider
    When Kullanıcı email olarak "invalid@example.com" ve şifre olarak "wrongpass" girer
    And Login butonuna tıklar
    Then "The selected email is invalid" hata mesajı görünür olmalı

  Scenario: Geçerli bilgilerle giriş yapıldığında başarılı şekilde giriş yapılmalı
    Given Kullanıcı login sayfasına gider
    When Kullanıcı email olarak "validuser@example.com" ve şifre olarak "validpassword" girer
    And Login butonuna tıklar
    Then Kullanıcı başarıyla giriş yapmış olmalı