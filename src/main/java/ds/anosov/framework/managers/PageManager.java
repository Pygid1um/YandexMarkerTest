package ds.anosov.framework.managers;

import ds.anosov.framework.pages.*;

public class PageManager {

    private static PageManager INSTANCE = null;

    private MainYandexPage1 mainYandexPage;
    private MainMarketPage2 mainMarketPage;
    private ElectronicsPage3 electronicsPage;
    private TVsAndAccessoriesPage4 tVsAndAccessoriesPage;
    private TVsPage5 tVsPage5;
    private FiltersPage6 filtersPage6;
    private ResultTVsPage7 resultTVsPage7;
    private SearchResult8 searchResult8;
    private HeadphonesAndAudioEquipmentPage9 headphonesAndAudioEquipmentPage9;
    private CommonElementsPage commonElementsPage;
    private HeadphonesAndBluetoothHeadsetsPage10 headphonesAndBluetoothHeadsetsPage10;


    private PageManager() {

    }

    public static PageManager getPageManager() {
        if (INSTANCE == null) {
            INSTANCE = new PageManager();
        }
        return INSTANCE;
    }


    public MainYandexPage1 getMainYandexPage() {
        if (mainYandexPage == null) {
            mainYandexPage = new MainYandexPage1();
        }
        return mainYandexPage;
    }

    public MainMarketPage2 getMainMarketPage() {
        if (mainMarketPage == null) {
            mainMarketPage = new MainMarketPage2();
        }
        return mainMarketPage;
    }

    public ElectronicsPage3 getElectronicsPage() {
        if (electronicsPage == null) {
            electronicsPage = new ElectronicsPage3();
        }
        return electronicsPage;
    }

    public TVsAndAccessoriesPage4 getTVsAndAccessoriesPage() {
        if (tVsAndAccessoriesPage == null) {
            tVsAndAccessoriesPage = new TVsAndAccessoriesPage4();
        }
        return tVsAndAccessoriesPage;
    }

    public TVsPage5 getTVsPage5() {
        if (tVsPage5 == null) {
            tVsPage5 = new TVsPage5();
        }
        return tVsPage5;
    }

        public FiltersPage6 getFiltersPage6() {
        if (filtersPage6 == null) {
            filtersPage6 = new FiltersPage6();
        }
        return filtersPage6;
    }

    public ResultTVsPage7 getResultTVsPage7() {
        if (resultTVsPage7 == null) {
            resultTVsPage7 = new ResultTVsPage7();
        }
        return resultTVsPage7;
    }

    public SearchResult8 getSearchResult8() {
        if (searchResult8 == null) {
            searchResult8 = new SearchResult8();
        }
        return searchResult8;
    }

    public HeadphonesAndAudioEquipmentPage9 getHeadphonesAndAudioEquipmentPage9() {
        if (headphonesAndAudioEquipmentPage9 == null) {
            headphonesAndAudioEquipmentPage9 = new HeadphonesAndAudioEquipmentPage9();
        }
        return headphonesAndAudioEquipmentPage9;
    }

    public CommonElementsPage getCommonElementsPage() {
        if (commonElementsPage == null) {
            commonElementsPage = new CommonElementsPage();
        }
        return commonElementsPage;
    }

    public HeadphonesAndBluetoothHeadsetsPage10 getHeadphonesAndBluetoothHeadsetsPage10() {
        if (headphonesAndBluetoothHeadsetsPage10 == null) {
            headphonesAndBluetoothHeadsetsPage10 = new HeadphonesAndBluetoothHeadsetsPage10();
        }
        return headphonesAndBluetoothHeadsetsPage10;
    }



}


