import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mapping(

    @SerialName("endpoints")
    val endpoints: Map<String, Map<String, Map<String, String>>>,

    @SerialName("vTokens")
    val vTokens: Map<String, Map<String, Map<String, String>>>,

    @SerialName("vTokenScheme")
    val vTokenScheme: Map<String, Map<String, String>>,
)

private val ApiEndpoints0002 = mapOf(
    "uonetplus-uczen" to mapOf(
        "Autoryzacja" to "00b61915-f3ec-421d-b7af-07aa8c4c162f",
        "DostepOffice" to "efa4a7ac-27bf-49af-90ff-ae0852339dd3",
        "EgzaminySemestralne" to "32915d4e-e542-4756-8c4b-c600f674f488",
        "EgzaminyZewnetrzne" to "9b48403a-cc4f-46a5-a51b-f04fea8753ee",
        "EwidencjaObecnosci" to "4ae4c4f5-209e-40e0-80db-3d77c484d528",
        "FormularzeSzablony" to "e36648d3-83fa-491b-8e91-5bea927120f1",
        "FormularzeSzablonyDownload" to "e1a812dd-9399-4354-aa5e-77304e042602",
        "FormularzeWysylanie" to "aa2d4eca-517c-4b53-ac44-8d5ea315bb7f",
        "Frekwencja" to "cc65835b-721d-4f4b-a316-799aed29c56f",
        "FrekwencjaStatystyki" to "a3ebd829-ee89-41c5-81c3-35a812c98640",
        "FrekwencjaStatystykiPrzedmioty" to "4c4133e2-cac7-444e-ab26-83501e5ddce5",
        "Homework" to "1dfb0cc9-584c-46c9-8f8b-bad061f9ebee",
        "Jadlospis" to "0c746ff5-f4cb-4537-b269-e3a4ac215eea",
        "LekcjeZaplanowane" to "3e8440cc-c832-45d9-abb4-3046977adb14",
        "LekcjeZrealizowane" to "9155e959-b2e7-4e05-9f2b-4773916b6dc2",
        "Oceny" to "42fd0eae-afaa-4772-ab73-66cdc1577649",
        "Ogloszenia" to "7e92f621-b90d-462e-ba6c-8b0110eb6494",
        "Oplaty" to "590bff89-a3ed-4bae-b0df-a18bdb1614e3",
        "PlanZajec" to "f6495353-4047-4752-91b6-ca202990e9e0",
        "Platnosc" to "4ba184c1-4419-4423-8864-8a6d7d1261c3",
        "PlatnoscMetadata" to "65c91912-8925-4bf2-b150-504324d781b8",
        "PodrecznikiLataSzkolne" to "862000c9-06a1-4505-b730-7fc3ed194007",
        "PodrecznikiUcznia" to "f65af6b8-1d86-4a47-9324-2c941eeb0140",
        "Pomoc" to "3380c914-a20d-44cd-9480-b2a64a3b5cf7",
        "RejestracjaUrzadzeniaToken" to "f51b7f8e-27fc-4522-aa87-fa881ee3afb8",
        "RejestracjaUrzadzeniaTokenCertyfikat" to "9fd15a23-2ec0-48be-8596-c46b7c30daac",
        "RozpoczeciePlatnosci" to "cd025374-b202-4efe-996c-18e074083775",
        "ScalanieKont" to "e4ac68c9-cf32-4ff6-be19-677cb5e5c255",
        "Sprawdziany" to "9bf0410c-aae5-447c-947e-49c815edbcb3",
        "Statystyki" to "dfa2d512-6682-414b-908b-6e208dfa0c6e",
        "SzkolaINauczyciele" to "b59d07c6-1146-4a50-ba6b-763ee8b151a3",
        "Uczen" to "a465bde1-9509-4706-bad2-658578482e04",
        "UczenCache" to "f18ddca0-400e-47cc-89a1-4bbe6685810b",
        "UczenDziennik" to "bef3daf1-07cd-4de6-b059-ee5909a7beb9",
        "UczenZdjecie" to "c1ba3b01-d53c-4577-98ab-4f1a620a3a35",
        "Usprawiedliwienia" to "863af74c-79aa-48f4-a0e6-aad168720dfd",
        "UwagiIOsiagniecia" to "6d869250-f637-4da0-a44b-c981299a55ce",
        "ZarejestrowaneUrzadzenia" to "bc9c2af4-fb13-4f9b-86e4-59ee12bfff85",
        "Zebrania" to "13fc67ca-19fc-4128-b8f0-41eed7f29838",
        "ZebraniaObecnosc" to "6ef8e1de-1234-4f39-9cd4-f68dabb8a440",
        "ZgloszoneNieobecnosci" to "80fe9dc2-8c36-41ea-8009-82503ff3c810",
    ),
    "uonetplus-uczenplus" to mapOf(
        "Context" to "7fbcc3fc-1021-444e-86ec-506683e02337",
        "AutoryzacjaPesel" to "AutoryzacjaPesel",
        "Frekwencja" to "c1fc4853-7216-4fd1-9957-4426278bb0bc",
        "Usprawiedliwienia" to "e3ae5a25-40ba-46f6-8e3f-fa325c68a300",
        "FrekwencjaStatystyki" to "85ec4b45-092b-49ff-a280-89c8439d2e09",
        "ZarejestrowaneUrzadzenia" to "eca2a314-4aa1-4242-a032-82915863b00e",
        "RejestracjaUrzadzeniaToken" to "RejestracjaUrzadzeniaToken",
        "Zebrania" to "358477c6-2917-4a11-9208-8abdcde4d05c",
        "RealizacjaZajec" to "25c2155a-ee89-4f0b-b1e2-000f7eebbf06",
        "SprawdzianyZadaniaDomowe" to "65b13621-cafd-4e86-b7a2-093acc60f618",
        "SprawdzianSzczegoly" to "81ee73f9-9b4f-415f-aa6a-2cb7edaae3cd",
        "ZadanieDomoweSzczegoly" to "fd6a4f90-5cb2-44f1-991b-fc4fbba8acbe",
        "PlanZajec" to "b08b6215-ebac-481d-81b9-14807a098731",
        "DniWolne" to "457deb32-212c-4564-8c2b-7941a1f091c9",
        "Uwagi" to "f0dcdc6d-cccf-42b9-86e3-02e7e9c5bb8d",
        "Nauczyciele" to "4e68fe23-18d2-42ef-94c4-27acbd4ab16c",
        "Informacje" to "dcae87e5-17a7-40d5-b362-f6caa9162715",
        "DaneUcznia" to "d7ff4abc-3a93-45d3-b28d-f4fb82fcd565",
        "UczenZdjecie" to "86e7b08f-de0c-4cc7-8042-e3a3796f7090",
        "OkresyKlasyfikacyjne" to "0669f1fd-e6f0-4007-ba4a-1d99c9107bb4",
        "Oceny" to "587b18fa-0cdd-4db9-9bc8-e2d67094b385",
    ),
    "uonetplus-wiadomosciplus" to mapOf(
        "Skrzynki" to "787817a4-bfa8-472c-b1ce-bbe324b308cf",
        "Odebrane" to "fa8d0cb9-742e-4f9f-b3e2-65b7d5cd7aa6",
        "OdebraneSkrzynka" to "9545648d-6534-4282-acb7-6e9cc52ab402",
        "Wyslane" to "962f3256-b82a-42bd-8f20-f03d79723516",
        "WyslaneSkrzynka" to "a046f45d-42ae-4072-9684-e957a797a22b",
        "Usuniete" to "94c2e642-b8e3-41f7-8428-27c3f213cb5d",
        "UsunieteSkrzynka" to "bae7f54c-f18e-4553-92d6-9a5f93392b39",
        "WiadomoscOdpowiedzPrzekaz" to "44444524-ba04-4259-8853-88343cf294be",
        "WiadomoscNowa" to "4f02e91e-b9ad-4da1-b4d9-84f258ad1d12",
        "MoveTrash" to "b2131c71-8d76-4d93-9274-1d5b4f30c915",
        "Delete" to "cd379bae-9700-48b4-a0d0-9eca08ee908f",
        "RestoreTrash" to "e6de58f9-4db1-4cd2-afdf-ac9fcca37e43",
    ),
)
private val ApiEndpoints0003 = mapOf(
    "uonetplus-uczen" to mapOf(
        "Autoryzacja" to "b82c987d-8e94-4ed3-b46e-2d1818f2e0f8",
        "DostepOffice" to "9d9b5874-68f4-4f1e-bef5-372f1cb11d29",
        "EgzaminySemestralne" to "99b62670-2adc-4c17-9abc-6e3d42eec773",
        "EgzaminyZewnetrzne" to "4db8f093-352a-4a00-a299-0e9b819c8c58",
        "EwidencjaObecnosci" to "02429d97-5877-42ae-a44e-5dd7531e20b4",
        "FormularzeSzablony" to "e02fac63-909e-450c-a4ab-75bfd4865189",
        "FormularzeSzablonyDownload" to "FormularzeSzablonyDownload",
        "FormularzeWysylanie" to "b97e880e-ae8d-44b6-a48d-92c9be7d22f5",
        "Frekwencja" to "80dc9527-386d-4da5-b688-3c3a9c4c49a9",
        "FrekwencjaStatystyki" to "a6d0fa58-5613-45e4-8f37-e2e5cba26dd3",
        "FrekwencjaStatystykiPrzedmioty" to "baa947c6-915b-4498-afdb-11ec6b088d36",
        "Homework" to "302944cd-7f41-4de8-8c9f-02dd00990f62",
        "Jadlospis" to "738a6eff-3bb3-4ff7-9443-70e6e96b61ab",
        "LekcjeZaplanowane" to "59874a90-98f2-4aa2-a857-f029b88a667c",
        "LekcjeZrealizowane" to "23f18c73-b0eb-4a1a-b9d3-67b9f3513a12",
        "Oceny" to "1e1ecd09-aa17-46ac-8cf4-90b1bf0c837d",
        "Ogloszenia" to "ba99b004-dca2-41b4-af6b-13969546ce65",
        "Oplaty" to "d58b34e4-0220-4363-b08f-fa307230898d",
        "PlanZajec" to "e59d0f63-92e1-47d9-a8e1-293eed48e4b4",
        "Platnosc" to "2b5d4da7-8b0f-45e0-923d-0b20d327800a",
        "PlatnoscMetadata" to "ca5a0fa1-78f1-4fad-b7ac-59fbdf6bdaf4",
        "PodrecznikiLataSzkolne" to "0c3f9d64-9561-42ab-825e-e73b4097c2d0",
        "PodrecznikiUcznia" to "2e7a1def-cdc3-4944-862c-5e94207ae891",
        "Pomoc" to "0cde801a-9290-4780-9099-96f7a130308e",
        "RejestracjaUrzadzeniaToken" to "17786f90-2725-477f-98ac-f0e1bff11d7d",
        "RejestracjaUrzadzeniaTokenCertyfikat" to "de16ca24-4638-4b11-8b2d-6ed09ec82b8a",
        "RozpoczeciePlatnosci" to "90273adc-6308-47b1-be2b-b8d2297a1530",
        "ScalanieKont" to "95661b3e-b9ac-416c-bf35-f195994f8af5",
        "Sprawdziany" to "d6404626-e7e4-4093-8477-4eb964da19db",
        "Statystyki" to "f8308032-0674-4bf7-a7d5-2642d064ef24",
        "SzkolaINauczyciele" to "a5ec0ae3-f7eb-4548-a484-f725e0164634",
        "Uczen" to "f8aa0d01-bd77-44d5-aa23-2606afbc27f5",
        "UczenCache" to "21a5186d-2aab-4123-bad7-269aa7173bb2",
        "UczenDziennik" to "a01ea13f-14f0-4c56-8b91-790e5aeecdf1",
        "UczenZdjecie" to "b4a0f9aa-2a45-4e3d-bd9a-f1513e949f83",
        "Usprawiedliwienia" to "81db3fa0-fb76-401a-ae9e-0fdffc86d2ff",
        "UwagiIOsiagniecia" to "f63b7ca7-cfe2-4b0b-80cf-1ef1baed597d",
        "ZarejestrowaneUrzadzenia" to "5a98cd83-f542-4bd2-a1eb-c53d75360aa7",
        "Zebrania" to "fb20a581-5ad7-49ab-b640-ccdd3f74b0ea",
        "ZebraniaObecnosc" to "a057e980-c662-4573-b485-01072dab2c14",
        "ZgloszoneNieobecnosci" to "5c63a985-2149-4e7b-a30f-3692b16b69e3",
    ),
    "uonetplus-uczenplus" to mapOf(
        "Context" to "308f5f36-16cb-45c8-8a43-1e038de2b30a",
        "AutoryzacjaPesel" to "AutoryzacjaPesel",
        "Frekwencja" to "60c348e6-ed6d-4308-a08d-e6dfdf5a95b8",
        "Usprawiedliwienia" to "9ab082c9-1d77-421e-8701-8bb68903cfe4",
        "FrekwencjaStatystyki" to "5cffb3be-5474-41a4-bb56-4abc38551865",
        "ZarejestrowaneUrzadzenia" to "e8f02f74-073d-4cb2-81dd-9bbb674d0d94",
        "RejestracjaUrzadzeniaToken" to "RejestracjaUrzadzeniaToken",
        "Zebrania" to "f780e794-adf0-4e57-9c56-a1e00fd77fe3",
        "RealizacjaZajec" to "0c070a15-a2ef-451a-8632-33f2150d0aec",
        "SprawdzianyZadaniaDomowe" to "6e4f701b-4022-4795-9eba-f749e3507886",
        "SprawdzianSzczegoly" to "764823c2-07d5-49a7-8d32-c643518e7ddb",
        "ZadanieDomoweSzczegoly" to "f19eac86-5b3a-4b76-b1c3-c3ce8d6a4e21",
        "PlanZajec" to "1cb14e17-8147-40d3-a6e9-1c6aa9549172",
        "DniWolne" to "45d009c7-d378-4247-8dbd-320ee5a760ff",
        "Uwagi" to "b4ba909b-e445-45ee-b94d-637b03f93089",
        "Nauczyciele" to "d551eb83-8b76-4b8a-931c-a9a4e7edaaf8",
        "Informacje" to "ebddc034-9716-4d2c-8dce-00f0554a5c99",
        "DaneUcznia" to "394d2738-b609-4488-b08f-f16343e25289",
        "UczenZdjecie" to "28e411f0-cc96-4f58-ae7f-ac77b7665cf9",
        "OkresyKlasyfikacyjne" to "c4ef1a36-b928-428f-8a9e-184ea0185c2f",
        "Oceny" to "1b1bfd67-6681-47b0-b5d1-c4941be2f3dd",
    ),
    "uonetplus-wiadomosciplus" to mapOf(
        "Skrzynki" to "a04c1b46-48f5-4856-9eae-1efe9fface1a",
        "Odebrane" to "be2f38a5-f090-4d38-b78a-1e776d304b20",
        "OdebraneSkrzynka" to "4e096df8-70e9-4a7c-b72d-486d6d05d87d",
        "Wyslane" to "dee02521-890a-4701-9699-de9b1080f30a",
        "WyslaneSkrzynka" to "1aab4b35-fdeb-422d-9e62-b8337c2f1a31",
        "Usuniete" to "9a1d2b04-763e-4e5a-8835-e356f52ed9b4",
        "UsunieteSkrzynka" to "a3e8cd92-f3bd-4bf3-9a1b-63f20b475982",
        "WiadomoscOdpowiedzPrzekaz" to "WiadomoscOdpowiedzPrzekaz",
        "WiadomoscNowa" to "03051ddd-22dd-45a6-a214-211c8dab0f7d",
        "MoveTrash" to "724f1218-447a-4110-a9ce-8c9bc52547f5",
        "Delete" to "Delete",
        "RestoreTrash" to "caf5eacb-a2ab-44d7-82c1-bcbd0b7612ed",
    ),
)

private val ApiEndpoints0004Student = mapOf(
    "Autoryzacja" to "2fffe058-1cd2-4f35-a33f-f63a22ea845b",
    "DostepOffice" to "a637167d-aeeb-48ac-9b1f-35955ced5d87",
    "EgzaminySemestralne" to "6ad87c8f-899a-49e3-a18e-87bbe37a8500",
    "EgzaminyZewnetrzne" to "18d9c26a-0ee4-400b-959b-56a01d5e3bea",
    "EwidencjaObecnosci" to "cc8d2313-465f-4950-adca-3ef93c006d1a",
    "FormularzeSzablony" to "628f00a5-076e-46e3-8660-ecd475dcf7c7",
    "FormularzeWysylanie" to "0d544f4a-786f-4276-9459-3ed428e51e85",
    "Frekwencja" to "26517c9a-a193-410f-b9a2-70cbcc98a542",
    "FrekwencjaStatystyki" to "9a216ff7-4a99-48ce-9876-e1d1ec756e25",
    "FrekwencjaStatystykiPrzedmioty" to "47d27f71-0ebb-4e2a-b0bd-664281397420",
    "Homework" to "c913fbbb-e163-4427-b2f9-82cdf3f3db8c",
    "Jadlospis" to "a09d0ce0-2771-4a78-ac33-9a790485270d",
    "LekcjeZaplanowane" to "bf20db85-be85-41b1-a857-a663bdc9e112",
    "LekcjeZrealizowane" to "5bde0359-6b17-45d5-8004-d8f86b3991b5",
    "Oceny" to "52d0e143-54b9-4131-8e40-44478135e7d7",
    "Ogloszenia" to "3fc35e9e-1b0a-4589-b517-f09c66a27704",
    "Oplaty" to "a23be32b-d117-4cd0-b3cf-70e1a2d9bc83",
    "PlanZajec" to "f6d28f27-284a-40bc-af75-060838ad9b54",
    "Platnosc" to "51c3f200-cb4b-4080-a23c-a0b7bdde2ea7",
    "PlatnoscMetadata" to "ead25309-e0c3-43d9-9e24-89a503863b68",
    "PodrecznikiLataSzkolne" to "87d29cc9-eeb9-4185-bbf3-3c60beb0560c",
    "PodrecznikiUcznia" to "828eb747-99c4-42d8-99ee-a0b6c0cc00d1",
    "Pomoc" to "e4be6688-3976-48f8-9e23-fafc547ce3f8",
    "RejestracjaUrzadzeniaToken" to "da3c352f-81ec-4aa9-9481-e3fc79d55701",
    "RejestracjaUrzadzeniaTokenCertyfikat" to "7a35c322-831f-4db2-98a3-462816145797",
    "RozpoczeciePlatnosci" to "f2333d25-87bc-40e0-8722-11f1831b15c9",
    "ScalanieKont" to "73339461-82b3-4ea1-952e-0d1124f8e2ca",
    "Sprawdziany" to "1ce3d57f-72a0-487e-84f2-ad1690ec41bb",
    "Statystyki" to "fbd1bf54-37e6-4fb2-ad3f-1d017bdb7119",
    "SzkolaINauczyciele" to "4642415b-947d-4ec9-955f-0af48a7e5b9b",
    "Uczen" to "d8756ab6-cffa-4c36-a525-08796c6540e7",
    "UczenCache" to "a0bb024d-647e-4ee9-8bc6-6fc649925585",
    "UczenDziennik" to "7459f626-08ff-4ae5-874e-ab5f9e68a565",
    "UczenZdjecie" to "b56f7048-2630-4950-a941-47d8f7f97386",
    "Usprawiedliwienia" to "5f4f11f5-0b1b-4605-b26d-6802abfc1ec3",
    "UwagiIOsiagniecia" to "74fd052f-eb86-496b-a5e7-7f1a53e908f5",
    "ZarejestrowaneUrzadzenia" to "32e18d4e-5702-4bdb-ab9d-1987cb5749f8",
    "Zebrania" to "94ae9ded-cc09-48e1-898f-84bbb6cc85a5",
    "ZebraniaObecnosc" to "a4b6e50d-704d-47aa-baa1-cc18cf0685cc",
    "ZgloszoneNieobecnosci" to "cc9b9bdd-39b5-4772-905f-5cb11ff48fc9",
)
private val ApiEndpoints0004Messages165 = mapOf(
    "WiadomoscSzczegoly" to "ba1abab4-5725-4483-942e-c6f016fdf25c",
    "WiadomoscOdpowiedzPrzekaz" to "24592d75-3dbb-4238-9a5f-48f7da951673",
    "WiadomoscNowa" to "28409679-2864-454c-add1-5c7025f51489",
    "Pracownicy" to "3c6002ef-477d-4258-81ac-ebfd4d6b9759",
    "MoveTrash" to "1dbc70aa-be5d-463d-9763-0d82cf8f22de",
    "RestoreTrash" to "e47d302c-035d-4bbe-bdb7-ae1b7658c549",
)
private val ApiEndpoints0004Messages166 = mapOf(
    "Skrzynki" to "bbf0d83f-0890-4af1-9e09-16cda1a9b785",
    "Odebrane" to "db26ce00-2069-40bd-a7fe-94be0c763c7e",
    "OdebraneSkrzynka" to "66419d85-5f94-4d07-ba97-82a1678d7d82",
    "Wyslane" to "dd345c3b-3676-4771-aa2a-7c898ca4428d",
    "WyslaneSkrzynka" to "806febc4-ff14-47c0-b6ca-6e337d188a30",
    "Usuniete" to "8173b1bf-c6c9-44a7-bc43-84fcb92a8ec5",
    "UsunieteSkrzynka" to "e06d5032-2214-4797-8142-27bf0f32846c",
    "WiadomoscSzczegoly" to "ba1abab4-5725-4483-942e-c6f016fdf25c",
    "WiadomoscOdpowiedzPrzekaz" to "24592d75-3dbb-4238-9a5f-48f7da951673",
    "WiadomoscNowa" to "28409679-2864-454c-add1-5c7025f51489",
    "Pracownicy" to "3c6002ef-477d-4258-81ac-ebfd4d6b9759",
    "MoveTrash" to "1dbc70aa-be5d-463d-9763-0d82cf8f22de",
    "RestoreTrash" to "e47d302c-035d-4bbe-bdb7-ae1b7658c549",
)

private val ApiEndpoints0005Student = mapOf(
    "Autoryzacja" to "fcb6e2c1-5045-49ed-92ad-b19df383ab17",
    "DostepOffice" to "0e605e40-a7f4-4b86-b071-36b7e627904c",
    "EgzaminySemestralne" to "f6b8fd15-ff7e-40d9-88d9-6f35f750c9a7",
    "EgzaminyZewnetrzne" to "02291b68-6edd-4ab7-8533-99f7e30b4c26",
    "EwidencjaObecnosci" to "42946260-12ca-4ce6-964b-29b4bd9a7f53",
    "FormularzeSzablony" to "6fb45fa2-b5b6-421b-90f4-e26daca269d3",
    "FormularzeWysylanie" to "a48aab9a-4e55-4210-a3c7-8e4816e0b29f",
    "Frekwencja" to "1cd6bc7d-09f0-4b6c-8fd8-71fff48ad3d1",
    "FrekwencjaStatystyki" to "4f679063-5def-46eb-bac1-1f213f98ea07",
    "FrekwencjaStatystykiPrzedmioty" to "71091f89-ddb7-42e1-9cfd-c319a69dd1e6",
    "Homework" to "48b1f501-c2c5-42db-8793-821bf9300bdd",
    "Jadlospis" to "9236db34-c919-42bd-98a7-40a2a906534e",
    "LekcjeZaplanowane" to "382a54a7-2afd-4ed1-94cd-c0d4412f7570",
    "LekcjeZrealizowane" to "ccfc87cd-01c5-46f0-a308-726af906226c",
    "Oceny" to "e01e5662-4782-4dc2-8bbd-2952ca08d840",
    "Ogloszenia" to "b1c64969-02d5-4f48-b5a3-193e3ae43933",
    "Oplaty" to "13f8210a-f5ea-48d6-8ca3-8a7f96e291c3",
    "PlanZajec" to "a7fa98b8-8318-4df5-b995-519f25f152ce",
    "Platnosc" to "6feb702d-6a7b-4b9f-aa15-0cd4af8a2fdd",
    "PlatnoscMetadata" to "56c93b0a-4fcb-4829-9ac0-c467801a2041",
    "PodrecznikiLataSzkolne" to "591fe80c-db01-43d4-8edf-2053a4ee9ebd",
    "PodrecznikiUcznia" to "040eaade-7c64-4ee5-a03b-817a89ea0461",
    "Pomoc" to "e895ae61-5ee7-403b-8672-47afbb57aab0",
    "RejestracjaUrzadzeniaToken" to "71b1c479-7e9f-4bc5-8fd6-13150d777288",
    "RejestracjaUrzadzeniaTokenCertyfikat" to "f14b1e6b-b266-4168-aae6-b05e7bde6229",
    "RozpoczeciePlatnosci" to "71af3913-e56a-499c-b677-eb0abbcbf8ca",
    "ScalanieKont" to "d0cd7570-4be7-45b3-801c-f5f453742e82",
    "Sprawdziany" to "df2fb170-e19d-4be5-8a29-7b600d22b735",
    "Statystyki" to "d8161c76-12aa-4ab0-b8a9-b008b31f757f",
    "SzkolaINauczyciele" to "068211e7-a796-469f-bf34-ccbe47078387",
    "Uczen" to "6b6c9a6f-3221-4a99-a313-d9fe093d77cb",
    "UczenCache" to "c6bfe6c4-24ef-43eb-86ca-63474d99b3d8",
    "UczenDziennik" to "ced49ad0-a0ce-427e-bb09-ead7388801d0",
    "UczenZdjecie" to "39efb4ab-149f-41f6-9410-026f99252ccf",
    "Usprawiedliwienia" to "b326b6f2-864a-490a-b5a4-39d7e33cac05",
    "UwagiIOsiagniecia" to "c492af80-b897-4224-8bd1-daece66c6d11",
    "ZarejestrowaneUrzadzenia" to "13cf52b7-0bf8-4fc1-81ff-2dfa972e19d2",
    "Zebrania" to "4ab7733c-2573-4d8e-b760-a2d0f66f2009",
    "ZebraniaObecnosc" to "70ae4599-cbdd-47ec-948f-d212c6c7a8e7",
    "ZgloszoneNieobecnosci" to "bd469d6f-be21-4806-a1fe-d93fefbb10d6",
)

private val ApiEndpoints0006Student = mapOf(
    "Autoryzacja" to "48000dd3-47f4-420c-be20-02f2f8ea7519"
    "DostepOffice" to "e2521d26-8247-4aa7-a30d-74957530e9d6"
    "EgzaminySemestralne" to "37fd9e21-5d07-4f37-a84c-985fa219400d"
    "EgzaminyZewnetrzne" to "1e7839ea-d736-4408-ba9a-2f0e5ef4e481"
    "EwidencjaObecnosci" to "a894cd94-9107-49f5-b4b7-1db873bc72ff"
    "FormularzeSzablony" to "8114ebf1-3d3f-45d9-b0f6-b964bf7c76fe"
    "FormularzeWysylanie" to "84f76c91-a7c2-481b-94d0-5cd51764d1e1"
    "Frekwencja" to "ab864850-7fbc-4699-bd2b-f4d14a1c6dfc"
    "FrekwencjaStatystyki" to "24f19397-4859-405f-8574-0ea44f13ad32"
    "FrekwencjaStatystykiPrzedmioty" to "79ef0465-026d-4a5b-a0af-2a5f375a1089"
    "Homework" to "d3f909d5-63d0-44c2-a404-132e0ddac121"
    "Jadlospis" to "61c0e909-c307-402b-8cb1-67029ffdeca6"
    "LekcjeZaplanowane" to "0fe7707d-fbbd-4757-ac94-a6f58335eaea"
    "LekcjeZrealizowane" to "13ac9c1d-a53d-4250-9111-ebccbd44e28b"
    "Oceny" to "1bb0dc78-acef-4430-8f66-46f482259142"
    "Ogloszenia" to "c30df593-1907-48ce-a752-5cfd5ed03f24"
    "Oplaty" to "51ae0f70-6327-430c-a7f1-be036e8e44e2"
    "PlanZajec" to "01c94be1-ac72-4aca-95e4-29342dc57782"
    "Platnosc" to "6d4957dc-1418-41db-9598-18d12a870217"
    "PlatnoscMetadata" to "9d2cc24a-c022-4a40-9e7c-662e398b797c"
    "PodrecznikiLataSzkolne" to "e278e2c3-6fd9-472e-9963-60e1a10290d6"
    "PodrecznikiUcznia" to "568a3da1-2c5c-4ea2-8f24-f1fbc0d3bae4"
    "Pomoc" to "db34bd5f-1417-4479-ba4b-2e847dc7781e"
    "RejestracjaUrzadzeniaToken" to "0d7ec4e7-afcb-4fca-9b9b-7102804f4af9"
    "RejestracjaUrzadzeniaTokenCertyfikat" to "9c675268-4e7f-43ba-924d-cbe0bbe20321"
    "RozpoczeciePlatnosci" to "f2ba09db-727b-4c61-927e-6e7b7b350926"
    "ScalanieKont" to "ea1f58ea-2f27-41bb-b94d-818a8fbecabc"
    "Sprawdziany" to "6f43a00d-2846-4be3-b8d3-49a42f18acd9"
    "Statystyki" to "59a8772d-8082-4927-8351-a711da917995"
    "SzkolaINauczyciele" to "4aafbcb8-0b92-4dcb-849a-1a69f8d0cf63"
    "Uczen" to "badb2896-942f-4c80-8eeb-a6c0cdaada96"
    "UczenCache" to "be5e0cdc-b442-41ea-8079-1fc2ebde99a8"
    "UczenDziennik" to "1c462d92-8b30-4c3d-9803-cc1caac26da0"
    "UczenZdjecie" to "8923cafb-ff76-4305-84c3-d2ae4891306c"
    "Usprawiedliwienia" to "982537df-6fb1-47ef-a9e0-1ee68e3b868f"
    "UwagiIOsiagniecia" to "e5cd2a74-a930-46a4-81db-66cd05506cff"
    "ZarejestrowaneUrzadzenia" to "77d0875d-4c5e-4903-94cc-5757e6081288"
    "Zebrania" to "f455060f-76e6-4d43-9708-0ba51a4778f6"
    "ZebraniaObecnosc" to "638ed2ad-0cce-4736-bd55-40b8f6977767"
    "ZgloszoneNieobecnosci" to "5e394724-80f5-4472-9858-b769cdc3c4fd"
)


val ApiEndpointsMap165 = mapOf(
    "24.04.0002.58666" to ApiEndpoints0002,
    "24.04.0003.58698" to ApiEndpoints0003,
    "24.04.0004.58722" to mapOf(
        "uonetplus-uczen" to ApiEndpoints0004Student,
        "uonetplus-wiadomosciplus" to ApiEndpoints0004Messages165,
    ),
    "24.04.0005.58736" to mapOf(
        "uonetplus-uczen" to ApiEndpoints0005Student,
    ),
    "24.04.0006.58753" to mapOf(
        "uonetplus-uczen" to ApiEndpoints0006Student,
    ),
)
val ApiEndpointsMap166 = mapOf(
    "24.04.0002.58666" to ApiEndpoints0002,
    "24.04.0003.58698" to ApiEndpoints0003,
    "24.04.0004.58722" to mapOf(
        "uonetplus-uczen" to ApiEndpoints0004Student,
        "uonetplus-wiadomosciplus" to ApiEndpoints0004Messages166,
    ),
    "24.04.0005.58736" to mapOf(
        "uonetplus-uczen" to ApiEndpoints0005Student,
        "uonetplus-wiadomosciplus" to mapOf(
            "Skrzynki" to "d5b9960b-2219-43e2-b5d6-fd26462b8d93",
            "Odebrane" to "0c37d367-4ec9-44c3-8f76-ca66c21dfde7",
            "OdebraneSkrzynka" to "ee8f83ab-c15e-4674-99b8-f36113c0f55d",
            "Wyslane" to "09b50259-54e8-40f8-bbe0-5e45d2eb9170",
            "WyslaneSkrzynka" to "fce8bde0-79f1-49f1-8c74-15c7d2afd15a",
            "Usuniete" to "db885258-86de-4d3b-9bd3-ce20c366f1f6",
            "UsunieteSkrzynka" to "fc060d87-23e1-4200-b4bf-b9525072a66a",
            "WiadomoscSzczegoly" to "67123fc2-61f3-4b4d-93e2-05166f00b00b",
            "WiadomoscOdpowiedzPrzekaz" to "020cf8bf-30ea-458d-ab6a-1aa41d8e2162",
            "WiadomoscNowa" to "bb023253-3976-4257-b510-5c8c827f70f2",
            "Pracownicy" to "d34320d6-4acd-4cec-b959-35a3de5cdf25",
            "MoveTrash" to "63ba79a2-ea29-49e2-bf94-43fc5f7f2989",
            "RestoreTrash" to "38828e7a-d1bd-4054-832b-2fc1d124e41e",
        )
    ),
    "24.04.0006.58753" to mapOf(
        "uonetplus-uczen" to ApiEndpoints0006Student,
        "uonetplus-wiadomosciplus" to mapOf( // FIXME
            "Skrzynki" to "d5b9960b-2219-43e2-b5d6-fd26462b8d93",
            "Odebrane" to "0c37d367-4ec9-44c3-8f76-ca66c21dfde7",
            "OdebraneSkrzynka" to "ee8f83ab-c15e-4674-99b8-f36113c0f55d",
            "Wyslane" to "09b50259-54e8-40f8-bbe0-5e45d2eb9170",
            "WyslaneSkrzynka" to "fce8bde0-79f1-49f1-8c74-15c7d2afd15a",
            "Usuniete" to "db885258-86de-4d3b-9bd3-ce20c366f1f6",
            "UsunieteSkrzynka" to "fc060d87-23e1-4200-b4bf-b9525072a66a",
            "WiadomoscSzczegoly" to "67123fc2-61f3-4b4d-93e2-05166f00b00b",
            "WiadomoscOdpowiedzPrzekaz" to "020cf8bf-30ea-458d-ab6a-1aa41d8e2162",
            "WiadomoscNowa" to "bb023253-3976-4257-b510-5c8c827f70f2",
            "Pracownicy" to "d34320d6-4acd-4cec-b959-35a3de5cdf25",
            "MoveTrash" to "63ba79a2-ea29-49e2-bf94-43fc5f7f2989",
            "RestoreTrash" to "38828e7a-d1bd-4054-832b-2fc1d124e41e",
        )
    ),
)

val ApiEndpointsVTokenMap = mapOf(
    "24.04.0003.58698" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "Skrzynki" to "7d4b1844-d114-40e3-a565-696564703b38",
            "Odebrane" to "a94f324b-0ab8-43eb-830e-814d4a0b4aca",
            "OdebraneSkrzynka" to "e17a1168-a8d1-45ba-b8e8-409cb25768a8",
            "Wyslane" to "16d74af5-d36e-4c1e-93cb-21e20624d053",
            "WyslaneSkrzynka" to "17a55992-7275-4c0c-945b-e0eca7bbc847",
            "Usuniete" to "cf13626d-df9d-4401-8a32-bd5c3e1a13d0",
            "UsunieteSkrzynka" to "bc17a165-2619-466e-bb40-2bbcd977d634",
        ),
        "uonetplus-uczenplus" to mapOf(
            "Context" to "e89f6a8e-bc6b-403b-a23d-2a807512d3bd",
            "Frekwencja" to "479fdac8-aa1f-4086-8a8a-b4b68640b810",
            "Usprawiedliwienia" to "a345d299-6123-4f0e-80d0-f8dd865ac9fc",
            "FrekwencjaStatystyki" to "664b5b7b-c829-4376-b248-03e6e7fd89b5",
            "ZarejestrowaneUrzadzenia" to "52568b87-c17e-47e9-a6a9-e457b6750c70",
            "Zebrania" to "e6fcf75f-9dda-4146-a586-efc49c01fe84",
            "RealizacjaZajec" to "ed496848-de26-4e46-90f2-07af4e2a2335",
            "SprawdzianyZadaniaDomowe" to "bec7772d-d4be-4b55-ac63-caf81ee9b642",
            "SprawdzianSzczegoly" to "3eb25350-845a-4d39-be9a-b141d7201047",
            "ZadanieDomoweSzczegoly" to "d83c94ba-40aa-44a0-a94b-9f0e2f0cb4d1",
            "PlanZajec" to "f22e7140-2ff1-446b-9b60-bec755011d40",
            "DniWolne" to "fabda71d-3e3d-4902-b76a-737c55455af0",
            "Uwagi" to "b8e73f39-69b2-4c90-b0cb-5b52fc205b98",
            "Nauczyciele" to "74ce2cac-11e7-4674-836d-26e19f4b3fe2",
            "Informacje" to "30ec098b-b182-45e2-81a5-60134ebd9a6b",
            "DaneUcznia" to "3b80e3f8-df07-4f87-b1ac-607f8ed164fc",
            "UczenZdjecie" to "5c91fef9-846f-4e6c-833d-cf9a766750b2",
            "OkresyKlasyfikacyjne" to "1ff9466c-2ebb-4649-9563-b005aab2a92a",
            "Oceny" to "353ebbfa-a387-4c61-8f36-1f499d21c665",
        ),
    ),
    "24.04.0004.58722" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "Skrzynki" to "843345c5-c9bc-45a6-8bc3-de19867e28f4",
            "Odebrane" to "f97337b2-8408-4655-8175-70269479c01d",
            "OdebraneSkrzynka" to "958fad5a-4e94-42f9-894b-7ca5352ea192",
            "Wyslane" to "5e8ddfb1-7af0-4f5a-a4c4-9a2884258e0f",
            "WyslaneSkrzynka" to "68fffbaf-7f32-4b1a-9da1-af926536d6d3",
            "Usuniete" to "c8ee2a38-7cf2-440f-bab1-befdf11f3830",
            "UsunieteSkrzynka" to "82dd1d9b-6dd9-4f55-8698-5af0c5c55dd1",
        ),
    ),
    "24.04.0005.58736" to mapOf(
        "uonetplus-wiadomosciplus" to mapOf(
            "Skrzynki" to "0de7ceb4-175a-42ca-a8d2-09410c5841b0",
            "Odebrane" to "a34390ce-3af3-496a-97c5-6e28dca9edb8",
            "OdebraneSkrzynka" to "749ddb70-72cf-4861-a4eb-751b368e46cd",
            "Wyslane" to "4b891b13-ecaa-47a5-be24-f8808d94e226",
            "WyslaneSkrzynka" to "045cc8fb-1f83-47e7-8f13-06978a33000b",
            "Usuniete" to "b79ebf8a-db1c-4658-a3b5-a9effca3facf",
            "UsunieteSkrzynka" to "620429d7-57b7-474b-b978-adfa1dc7049a",
        ),
    ),
    "24.04.0006.58753" to mapOf( // FIXME
        "uonetplus-wiadomosciplus" to mapOf(
            "Skrzynki" to "0de7ceb4-175a-42ca-a8d2-09410c5841b0",
            "Odebrane" to "a34390ce-3af3-496a-97c5-6e28dca9edb8",
            "OdebraneSkrzynka" to "749ddb70-72cf-4861-a4eb-751b368e46cd",
            "Wyslane" to "4b891b13-ecaa-47a5-be24-f8808d94e226",
            "WyslaneSkrzynka" to "045cc8fb-1f83-47e7-8f13-06978a33000b",
            "Usuniete" to "b79ebf8a-db1c-4658-a3b5-a9effca3facf",
            "UsunieteSkrzynka" to "620429d7-57b7-474b-b978-adfa1dc7049a",
        ),
    ),
)

val ApiEndpointsVTokenSchemeMap = mapOf(
    "24.04.0003.58698" to mapOf(
        "uonetplus-wiadomosciplus" to "{UUID}-{name}-{appCustomerDb}-{appVersion}",
    ),
    "24.04.0004.58722" to mapOf(
        "uonetplus-wiadomosciplus" to "{UUID}-{appCustomerDb}-{appVersion}",
    ),
    "24.04.0005.58736" to mapOf(
        "uonetplus-wiadomosciplus" to "{UUID}-{appCustomerDb}-{appVersion}-{apiKey}",
    ),
    "24.04.0005.58736" to mapOf(
        "uonetplus-wiadomosciplus" to "{UUID}-{appCustomerDb}-{appVersion}-{apiKey}", // FIXME
    ),
)
