import io.github.wulkanowy.messages.pojo.*

val messages = listOf(
    Message(
        id = 69,
        title = "VULCAN nas zablokował",
        content = "U wielu z was pojawił się dziś komunikat o nieaktywnym koncie z zaleceniem ponownego zalogowania, a po ponownym zalogowaniu jest tylko Brak uprawnień. To przez akcję wycelowaną w Wulkanowego. Kliknij, by przejść do posta na Facebooku",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/856818469794256",
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = false,
        isVisible = true,
        versionMax = 156,
    ),
    Message(
        id = 68,
        title = "O zmianach w średniej",
        content = "Firma VULCAN (którą przecież NIE JESTEŚMY) niespodziewania dokonała zmiany w wyświetlaniu średniej w ocenach, na co Wulkanowy nie był gotowy. Dlatego nasza apka nagle mogła zacząć pokazywać inną średnią, która jest tą z tylko biezącego semestru. Niedługo będzie dostępna aktualizacja, która to naprawi",
        priority = MessagePriority.MEDIUM,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = false,
        isVisible = true,
        versionMax = 155,
    ),
    Message(
        id = 67,
        title = "O problemach z logowaniem",
        content = "Dostępna jest aktualizacja naprawiająca ostatnie problemy z logowaniem. Kliknij, by przejść do sklepu AppGallery i zaktualizować aplikację",
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.HMS,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = false,
        isVisible = true,
        versionMax = 154,
    ),
    Message(
        id = 66,
        title = "O problemach z logowaniem",
        content = "Dostępna jest aktualizacja naprawiająca ostatnie problemy z logowaniem. Kliknij, by przejść do sklepu Play i zaktualizować aplikację",
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy&utm_source=message",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = false,
        isVisible = true,
        versionMax = 154,
    ),
    Message(
        id = 65,
        title = "Problemy z logowaniem",
        content = "Wiemy o problemach z lgoowaniem do Lubelskiego Portalu Oświatowego, ale niestety nie wiemy czym są one spowodowane. Badamy sprawę. Póki co zalecamy korzystanie z oficjalnej apki od VULCANa",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.EDU_LUBLIN.url,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 64,
        title = "Dostępna aktualizacja",
        content = "Aktualizacja naprawiająca większość błędów z ładowaniem danych jest dostępna w sklepie Play. Kliknij, aby przejść",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy&utm_source=message",
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
        ),
        versionMax = 152,
        isXVisible = false,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 63,
        title = "Masz problemy z weryfikacją captcha?",
        content = "Jeśli weryfikacja captcha się zapętliła i nie mozesz przejść dalej, to spróbuj zaktualizować WebView (albo zainstalować i ustawić w ustawieniach systemowych jako domyślną implementację WebView)",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://play.google.com/store/apps/details?id=com.google.android.webview",
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        versionMin = 151,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 62,
        title = "Masz problemy z ładowaniem rzeczy w apce? Przeczytaj",
        content = "Jeśli jesteś uzytkownikiem eduOne i mimo aktualizacji nic nie działa, to spróbuj wylogować się i zalogować ponownie",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
        ),
        versionMin = 151,
        isXVisible = true,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 61,
        title = "Informacja dla użytkowników systemu eduOne",
        content = "W poniedziałkowej aktualizacji dziennika, VULCAN wprowadził zmianę, przez którą system eduOne nie działa w Wulkanowym. Wydaliśmy aktualizację, która rozwiązuje większość problemów (kolejna jest w drodze). Uprzejmie prosimy o zaktualizowanie aplikacji w sklepie Play lub AppGallery",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 150,
        isXVisible = false,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 60,
        title = "Weekendowe problemy z dziennikiem",
        content = "Obserwujemy zwiększoną liczbę zgłoszeń problemów z dziennikiem od około 1:00 w nocy z piątku na sobotę. Raczej nie się spodziewamy, że VULCAN naprawi to przed poniedziałkiem :) Zalecamy cierpliwość i nieodświeżanie apki \"na siłe\" bo to tylko pogarsza sytuację",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 59,
        title = "Informacje o najnowszej aktualizacji",
        content = "Używasz najnowszej wersji Wulkanowego! Naprawiliśmy w niej ostatnie znane problemy. Jeśli borykasz się ciągle z jakimiś - kliknij i napisz o tym",
        priority = MessagePriority.LOW,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/817776823698421",
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
        ),
        versionMin = 148,
        isOkVisible = false,
        isXVisible = true,
        isVisible = false,
    ),
    Message(
        id = 58,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Na obecnej wersji nie działa logowanie do dziennika. Spowodowane jest to ostatnimi zmianami po stronie firmy VULCAN. Kliknij tutaj, by przejść do sklepu Play",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy&utm_source=message",
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 145,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 57,
        title = "Dziejsze problemy z dziennikiem",
        content = "VULCAN ma dzisiaj od rana problemy ze sobą. To NIE JEST problem po stronie naszej nieoficjalnej apki. Zalecamy cierpliwość, aż VULCAN to naprawi",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/807473091395461",
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = true,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 56,
        title = "Informacje o bieżących problemach z dziennikiem",
        content = "Masz jakiś problem z apką? Kliknij tutaj i napisz o nim",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/807158678093569",
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
        ),
        isXVisible = true,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 55,
        title = "Piątkowa awaria",
        content = "Zgłaszacie nam problemy z dostępem do dziennika. To prawda - VULCAN (nie Wulkanowy) ma awarię. Kliknij, by przeczytać więcej",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/796088305867273",
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isXVisible = false,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 54,
        title = "Od czwartku nie działa u ciebie apka? Przeczytaj",
        content = "Właśnie wydaliśmy aktualizację, która obchodzi ostatnie problemy z odświeżaniem danych i logowaniem. Znajdziesz ją klikając tutaj",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy&utm_source=message",
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 143,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 53,
        title = "Problemy z dziennikiem GPE",
        content = "Od czwartku Wulkanowy pokazuje błędy informujące o błednej dacie na telefonie. W tym przypadku to akurat nieprawda. Błąd jest po stronie GPE. Przez ten błąd nie działa równiez Dzienniczek VULCAN (jeśli się mylimy to nas poprawcie). Radzimy zgłaszać problem na helpdesk GPE",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        destinationUrl = "https://edu.gdansk.pl/",
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isVisible = false,
    ),
    Message(
        id = 52,
        title = "Informacja od GPE",
        content = "„Informujemy, że w najbliższy czwartek tj. 04.01.2024r. od godziny 22:00 do 06:00 dnia następnego mogą występować utrudnienia w dostępie do GPE spowodowane przerwą techniczną",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        destinationUrl = "https://edu.gdansk.pl/",
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isVisible = false,
    ),
    Message(
        id = 51,
        title = "Ogłoszenie",
        content = "„Krótka” informacja na temat tego, co się ostatnio działo z dziennikiem. Kliknij, żeby przeczytać",
        priority = MessagePriority.LOW,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/786639613478809",
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMin = 141,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 50,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Aktualizacja naprawiająca ostatnie problemy powinna być już u was dostępna. Kliknij, aby przejść do F-Droid",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://f-droid.org/packages/io.github.wulkanowy/",
        targetFlavor = AppFlavor.FDROID,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 140,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 49,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Aktualizacja naprawiająca ostatnie problemy powinna być już u was dostępna. Kliknij, aby przejść do Google Play",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy&utm_source=message",
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 140,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 48,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Aktualizacja naprawiająca ostatnie problemy powinna być już u was dostępna. Kliknij, aby przejść do Appgallery",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        targetFlavor = AppFlavor.HMS,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 140,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 47,
        title = "Występują u ciebie błędy? Jeśli nie, to zignoruj ten komunikat",
        content = "Pracujemy nad poprawką, która powinna ograniczyć występujące błędy przy logowaniu i odświezaniu danych. Niedługo pojawi się aktualizacja",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/786064996869604",
        types = listOf(
            MessageType.LOGIN_MESSAGE,
            MessageType.DASHBOARD_MESSAGE,
        ),
        versionMax = 140,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 46,
        title = "Błędy, błędy, błędy",
        content = "Wulkanowy nie działa. Wszystkim. Wiemy o problemie, pracujemy nad jego rozwiązaniem. Nie musicie nam już zgłaszać błędów, bo wiemy o nich :)",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
            MessageType.DASHBOARD_MESSAGE,
        ),
        versionMax = 138,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 45,
        title = "Informacja o problemach z dostępem do dziennika",
        content = "Od paru dni w Wulkanowym nie działa obsługa dziennika EduNet Miasta Tarnowa. Pracujemy nad przywróceniem działania, ale jeszcze nie wiemy ile to potrwa. W razie potrzeby skorzystania dziennika prosimy korzystać ze strony www dziennika lub oficjalnej aplikacji",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.UMT_TARNOW.url,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 44,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Aktualizacja naprawiająca ostatnie problemy powinna być już u was dostępna. Kliknij, aby przejść do F-Droid",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://f-droid.org/packages/io.github.wulkanowy/",
        targetFlavor = AppFlavor.FDROID,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 137,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 43,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Aktualizacja naprawiająca ostatnie problemy powinna być już u was dostępna. Kliknij, aby przejść do Google Play",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy&utm_source=message",
        targetFlavor = AppFlavor.PLAY,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 137,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 42,
        title = "Wymagana aktualizacja aplikacji!",
        content = "Aktualizacja naprawiająca ostatnie problemy powinna być już u was dostępna. Kliknij, aby przejść do Appgallery",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        targetFlavor = AppFlavor.HMS,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 137,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 41,
        title = "Widzisz \"Nieznane błędy dziennika\"?",
        content = "Widzisz nieznane błędy dziennika? Nie tylko ty! To przez ostatnią aktualizację systemu dziennika. Nic na to nie poradzimy i nie wiemy kiedy zostanie to naprawione",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.DASHBOARD_MESSAGE,
        ),
        versionMax = 137,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 40,
        title = "Problemy z logowaniem?",
        content = "Widzisz nieznane błędy dziennika lub komunikat \"Trwa wylogowanie...\"? Nie tylko ty! To przez ostatnią aktualizację systemu dziennika. Nic na to nie poradzimy i nie wiemy kiedy zostanie to naprawione",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        versionMax = 137,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 39,
        title = "Problemy z logowaniem?",
        content = "Kliknij tutaj, by zobaczyć najczęstsze znane problemy z logowaniem.\n\nPS. Pierwsze logowanie do dziennika zalecamy robić przez stronę www dziennika według instrukcji szkoły",
        priority = MessagePriority.MEDIUM,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/711506164325488",
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 38,
        title = "Problemy z logowaniem do dziennika",
        content = "Jeśli po wpisaniu hasła zobaczysz czerwony komunikat \"Trwa wylogowywanie...\" to... spróbuj ponownie później :)",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        types = listOf(
            MessageType.LOGIN_MESSAGE,
        ),
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 37,
        title = "Problemy na Gdańskim Portalu Edukacyjnym",
        content = "Otrzymujemy zgłoszenia dotyczące problemów z logowaniem i odświeżaniem danych w Wulkanowym u użytkowników GPE. To nie jest błąd po stronie Wulkanowego i nic z tym nie możemy zrobić. Problem należy zgłaszać do administracji GPE",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 36,
        title = "Planowane przerwy techniczne dziennika UONET+",
        content = "VULCAN planuje w najbliższych dniach przerwy techniczne w godzinach 22:00 – 06:00. Przeczytasz o nich więcej na stronie VULCANa klikając tutaj",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.vulcan.edu.pl/aktualnosci/planowana-przerwa-techniczna-w-e-dzienniku-uonet-529",
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 35,
        title = "Przerwa techniczna systemu UONET+",
        content = "Tak, zgadza się. Trzeci dzień z rzędu dziennik nie działa. To awaria całego systemu UONET+, a nie naszej apki. Nic na to nie poradzimy, trzeba czekać na reakcję VULCANa",
        priority = MessagePriority.MEDIUM,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 34,
        title = "Witaj w najnowszej wersji Wulkanowego",
        content = "Jeśli Cię to interesuje, to po kliknięciu tutaj znajdziesz opis zmian w tej aktualizacji. Jeśli nie chcesz tego widzieć kliknij OK",
        priority = MessagePriority.LOW,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/646383727504399",
        versionMin = 125,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 33,
        title = "Dostępna aktualizacja",
        content = "Na wersji, której używasz mogą występować problemy. Zaktualizuj Wulkanowego do najnowszej wersji",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.HMS,
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        versionMax = 129,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 32,
        title = "Dostępna aktualizacja",
        content = "Na wersji, której używasz mogą występować problemy. Zaktualizuj Wulkanowego do najnowszej wersji",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.PLAY,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        versionMax = 129,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 31,
        title = "W imieniu poniżej wyświetlają się gwiazdki i w apce pokazują się błędy?",
        content = "Jeśli tak, to kliknij tutaj po instrukcję naprawy tego problemu. Jeśli nie - zignoruj ten komunikat",
        priority = MessagePriority.MEDIUM,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/643278101148295",
        versionMax = 123,
        versionMin = 122,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 30,
        title = "Witaj w nowej wersji Wulkanowego!",
        content = "Dużo się ostatnio działo :) Jeśli masz jakieś problemy z aktualną wersją - kliknij tutaj i weź udział w dyskusji pod naszym postem na Facebooku",
        priority = MessagePriority.LOW,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/643228434486595",
        versionMin = 122,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 29,
        title = "UWAGA",
        content = "Z powodu aktualizacji systemu UONET+ przestało w Wulkanowym działać odświeanie większości danych (wiadomości jednak ciągle powinny działać). Aktualizacja naprawiająca ten problem pojawi się w okolicach niedzieli i poniedziałku",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.EDU_LUBLIN.url,
        destinationUrl = "https://twitter.com/wulkanowy/status/1654404443264122882",
        versionMax = 122,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 28,
        title = "UWAGA",
        content = "Z powodu aktualizacji systemu UONET+ przestało w Wulkanowym działać odświeanie większości danych (wiadomości jednak ciągle powinny działać). Aktualizacja naprawiająca ten problem pojawi się w okolicach niedzieli i poniedziałku",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        destinationUrl = "https://twitter.com/wulkanowy/status/1654404443264122882",
        versionMax = 122,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 27,
        title = "UWAGA",
        content = "System UONET+ ma obecnie problemy techniczne. W tym czasie może wyświetlać się komunikat o trwającej przerwie technicznej. Prosimy o cierpliwość i spróbowanie ponownie później",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 26,
        title = "UWAGA",
        content = "W związku z problemami technicznymi po stronie systemu UONET+ dostęp do dziennika może być w najbliższym czasie utrudniony lub nawet niemożliwy. Prosimy o cierpliwość i spróbowanie ponownie później",
        priority = MessagePriority.HIGH,

        targetRegisterHost = RegisterAddress.VULCAN.url,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 25,
        title = "Wesołych Świąt!",
        content = "Wesołych, spokojnych Świąt Bożego Narodzenia oraz szczęśliwego, bezawaryjnego Nowego Roku życzy Wulkanowy zespół! 🎄",
        priority = MessagePriority.LOW,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/552841720191934",
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 24,
        title = "UWAGA",
        content = "Aktualizacja naprawiająca obsługę systemu Resman powinna być już dostępna. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.RESMAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/546997824109657",
        versionMax = 116,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 23,
        title = "UWAGA. Kolejna awaria systemu UONET+",
        content = "VULCAN ma drugi dzień z rzędu problemy techniczne. Zachowaj spokój i spróbuj ponownie później. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/537177675091672",
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 22,
        title = "UWAGA. Informacja o przyczynie problemów z odświeżaniem danych",
        content = "VULCAN ma teraz problemy techniczne. Jako twórcy Wulkanowego nie mamy na to żadnego wpływu. Zachowaj spokój i spróbuj ponownie później. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/536251861850920",
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 21,
        title = "Ważna informacja dotycząca wiadomości",
        content = "Na zainstalowanej wersji Wulkanowego mogą występować problemy z wiadomościami. Kliknij w kafelek, by dowiedzieć się więcej",
        priority = MessagePriority.MEDIUM,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/534950415314398",
        versionMax = 115,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 20,
        title = "Informacje o wydaniu wersji 1.8.1",
        content = "Dziękujemy za aktualizację Wulkanowego! Kliknij w kafelek, żeby przeczytać o nowościach w tej wersji",
        priority = MessagePriority.LOW,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/525359099606863",
        versionMin = 116,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 19,
        title = "Obserwujemy problemy z dostępem do systemu UONET+",
        content = "To nie są problemy po stronie naszej aplikacji a po stronie serwerów VULCANa. Kliknij, by dowiedzieć się więcej",
        priority = MessagePriority.MEDIUM,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/524562059686567",
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 18,
        title = "Problemy techniczne z systemem UONET+",
        content = "Obserwujemy problemy z dostępem do dziennika UONET+. To NIE JEST błąd po stronie aplikacji tylko po stronie serwerów VULCANa. Spróbuj ponownie później",
        priority = MessagePriority.HIGH,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 17,
        title = "Awaria systemu UONET+",
        content = "Obserwujemy problemy z dostępem do dziennika UONET+. To NIE JEST błąd po stronie aplikacji tylko po stronie serwerów VULCANa. Spróbuj ponownie później",
        priority = MessagePriority.HIGH,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 16,
        title = "Ważna informacja dotycząca wiadomości",
        content = "Na zainstalowanej wersji Wulkanowego mogą występować problemy z wiadomościami. Kliknij w kafelek, by dowiedzieć się więcej",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/459115399564567",
        versionMin = 108,
        versionMax = 111,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 15,
        title = "Ważna informacja dotycząca wiadomości",
        content = "Zastanawiasz się, gdzie podziały się starsze wiadomości? Kliknij, żeby przeczytać więcej na ten temat na naszym fanpage'u na Facebooku",
        priority = MessagePriority.MEDIUM,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/453319193477521",
        versionMin = 108,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 14,
        title = "Dostepna aktualizacja",
        content = "W sklepie Play powinna być już dostępna aktualizacja, która przywraca podstawowe funkcjonalności modułu wiadomości. Kliknij, aby przejść do sklepu Play",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.PLAY,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        versionMax = 107,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 13,
        title = "Dostepna aktualizacja",
        content = "W sklepie AppGallery powinna być już dostępna aktualizacja, która przywraca podstawowe funkcjonalności modułu wiadomości. Kliknij, aby przejść do sklepu AppGallery",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.HMS,
        destinationUrl = "https://appgallery.huawei.com/#/app/C101440411",
        versionMax = 107,
        isOkVisible = false,
        isVisible = true,
    ),
    Message(
        id = 12,
        title = "Problemy z wiadomościami",
        content = "W ostatniej aktualizacji systemu UONET+ firma VULCAN gruntownie zmieniła moduł wiadomości, co w konsekwencji zepsuło obsługę wiadomości w Wulkanowym. Pracujemy nad naprawą",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://www.facebook.com/wulkanowy/posts/450349017107872",
        versionMax = 108,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 11,
        title = "Problemy z odświeżaniem danych i logowaniem",
        content = "Ostatnia aktualizacja systemu VULCAN UONET+ zepsuła w Wulkanowym logowanie do dziennika i odświeżanie danych. Pracujemy nad poprawką, ale nie wiemy kiedy uda nam się ją przygotować. Do tego czasu prosimy o cierpliwość",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 10,
        title = "Przerwa techniczna",
        content = "Aktualnie trwają prace konserwacyjne. Nie mamy pojęcia kiedy się zakończą. Prosimy o zachowanie cierpliwości i sprawdzenie dziennika ponownie za jakiś czas",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.VULCAN.url,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 9,
        title = "Błędy we frekwencji",
        content = "Przez ostatnią aktualizację systemu UONET+ we frekwencji brakuje informacji o przedmiotach. To nie błąd aplikacji - czekamy na rozwiązanie problemu przez firmę VULCAN.\nPS. Wulkanowy nie należy do firmy VULCAN",
        priority = MessagePriority.MEDIUM,
        isVisible = false,
    ),
    Message(
        id = 8,
        title = "Błędy we frekwencji",
        content = "W szczegółach frekwencji mogą występować błędy przy ładowaniu danych. Problem spowodowany jest ostatnią aktualizacją systemu UONET+. Poprawka jest juz dostępna w sklepie AppGallery",
        destinationUrl = "https://appgallery.huawei.com/app/C101440411",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.HMS,
        versionMax = 107,
        isVisible = true,
    ),
    Message(
        id = 7,
        title = "Błędy we frekwencji",
        content = "W szczegółach frekwencji mogą występować błędy przy ładowaniu danych. Problem spowodowany jest ostatnią aktualizacją systemu UONET+. Poprawka jest juz dostępna w sklepie Play",
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        priority = MessagePriority.HIGH,
        targetFlavor = AppFlavor.PLAY,
        versionMax = 107,
        isVisible = true,
    ),
    Message(
        id = 6,
        title = "Problemy z platformą Resman Rzeszów",
        content = "Informujemy o problemach z połączeniem z dziennikiem. Do czasu jego rozwiązania Wulkanowy może wyświetlać mylące komunikaty informujące o wystąpieniu błędu i zalecające sprawdzenie poprawności daty na urządzeniu, mimo że to nie ona stanowi problem. Należy poczekać na rozwiązanie problemu przez administratorów dziennika",
        priority = MessagePriority.HIGH,
        targetRegisterHost = RegisterAddress.RESMAN.url,
        isOkVisible = false,
        isVisible = false,
    ),
    Message(
        id = 5,
        title = "Wesołych Świąt!",
        content = "Wesołych, spokojnych świąt oraz szczęśliwego, bezawaryjnego Nowego Roku życzy zespół Wulkanowego! 🎄",
        priority = MessagePriority.LOW,
        versionMin = 102,
        isOkVisible = true,
        isVisible = false,
    ),
    Message(
        id = 4,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o nieznanym błędzie dziennika. W sklepie AppGallery dostępna jest aktualizacja",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://appgallery.huawei.com/app/C101440411",
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        targetFlavor = AppFlavor.HMS,
        versionMax = 101,
        isVisible = true,
    ),
    Message(
        id = 3,
        title = "Problemy z logowaniem",
        content = "Przez aktualizację dziennika Gdańskiej Platformy Edukacyjnej przestało działać logowanie w Wulkanowym. Przez to przy odświeżaniu danych pokazuje się komunikat o nieznanym błędzie dziennika. W sklepie Google Play dostępna jest aktualizacja",
        priority = MessagePriority.HIGH,
        destinationUrl = "https://play.google.com/store/apps/details?id=io.github.wulkanowy",
        targetRegisterHost = RegisterAddress.EDU_GDANSK.url,
        targetFlavor = AppFlavor.PLAY,
        versionMax = 101,
        isVisible = true,
    ),
    Message(
        id = 2,
        title = "Problemy z aplikacją",
        content = "Występują problemy z dostępem do systemu UONET+, które są spowodowane ostatnimi aktualizacjami po stronie VULCANa. Nie jest to winą Wulkanowego. Prosimy o cierpliwość do czasu aż VULCAN rozwiąże problem po swojej stronie",
        priority = MessagePriority.MEDIUM,
        isVisible = false,
    ),
    Message(
        id = 1,
        title = "Polityka prywatności",
        content = "Zaktualizowaliśmy politykę prywatności. Kliknij aby zobaczyć więcej",
        priority = MessagePriority.LOW,
        destinationUrl = "https://wulkanowy.github.io/polityka-prywatnosci",
        isOkVisible = true,
        isVisible = false,
    )
)
