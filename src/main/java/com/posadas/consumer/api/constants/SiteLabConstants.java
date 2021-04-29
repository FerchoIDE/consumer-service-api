package com.posadas.consumer.api.constants;

import com.liferay.portal.kernel.util.PropsUtil;

public class SiteLabConstants {

	
    public SiteLabConstants(String SITELAB_HOSTNAME_PORT){
        //Default Private Constructor
    }
    //--------------- generic constants -----------------

    public static String SITELAB_HOSTNAME_PORT = "sitelab.hostname.port";

    // hotel / destrionation code

    public static final String SITELAB_HOTEL_CODE_KEY = "sitelab.hotel.code.key";
    public static final String SITELAB_DESTINATION_CODE_KEY = "sitelab.destination.code.key";

    //sitelab image types starts
    public static final String SITELAB_IMAGE_THUMBNAIL = "sitelab.thumbnail";
    public static final String SITELAB_IMAGE_TINY = "sitelab.tiny";
    public static final String SITELAB_IMAGE_TINY_WIDE = "sitelab.tiny.wide";
    public static final String SITELAB_IMAGE_TINY_WIDE_A = "sitelab.tiny.wide.a";
    public static final String SITELAB_IMAGE_TINY_WIDE_B = "sitelab.tiny.wide.b";
    public static final String SITELAB_IMAGE_SMALL = "sitelab.small";
    public static final String SITELAB_IMAGE_SMALL_WIDE = "sitelab.small.wide";
    public static final String SITELAB_IMAGE_NEW_LARGE = "sitelab.new.large";
    public static final String SITELAB_IMAGE_MEDIUM = "sitelab.medium";
    public static final String SITELAB_IMAGE_MEDIUM_SMALL = "sitelab.medium.small";
    public static final String SITELAB_IMAGE_MEDIUM_WIDE = "sitelab.medium.wide";
    public static final String SITELAB_IMAGE_MEDIUM_WIDE_A = "sitelab.medium.wide.a";
    public static final String SITELAB_IMAGE_MEDIUM_DOUBLE_WIDE = "sitelab.medium.double.wide";
    public static final String SITELAB_IMAGE_MEDIUM_DOUBLE_WIDE_A = "sitelab.medium.double.wide.a";
    public static final String SITELAB_IMAGE_BIG = "sitelab.big";
    public static final String SITELAB_IMAGE_BIG_WIDE = "sitelab.big.wide";
    public static final String SITELAB_IMAGE_LARGE_HALF_WIDE = "sitelab.large.half.wide";
    public static final String SITELAB_IMAGE_TINY_TRIPLE_WIDE = "sitelab.tiny.triple.wide";
    public static final String SITELAB_IMAGE_MEDIUM_TRIPLE_WIDE = "sitelab.medium.triple.wide";
    public static final String SITELAB_IMAGE_MEDIUM_DOUBLE_WIDE_B = "sitelab.medium.double.wide.b";
    public static final String SITELAB_IMAGE_BIG_DOUBLE_WIDE = "sitelab.big.double.wide";
    public static final String SITELAB_IMAGE_ICON_TRIPLE_WIDE = "sitelab.icon.triple.wide";
    public static final String SITELAB_IMAGE_LARGE_WIDE = "sitelab.large.wide";
    public static final String SITELAB_IMAGE_LANDING_SMALL = "sitelab.landing.small";
    public static final String SITELAB_IMAGE_LANDING_BIG_C = "sitelab.landing.big.c";
    public static final String SITELAB_IMAGE_NEW_MEDIUM = "sitelab.new.medium";
    public static final String SITELAB_IMAGE_TINY_A = "sitelab.tiny.a";
    public static final String SITELAB_IMAGE_MEDIUM_ICON = "sitelab.medium.icon";
    //sitelab image types ends

    // Currency according to locale
    public static final String SITELAB_LANGUAGE_ENGLISH_KEY = "sitelab.cms.consumer.url.parameter.locale.en_EN";
    public static final String SITELAB_LANGUAGE_SPANISH_KEY = "sitelab.cms.consumer.url.parameter.locale.es_ES";
    public static final String SITELAB_LANGUAGE_POTUGESE_KEY = "sitelab.cms.consumer.url.parameter.locale.pt_PT";

    //currency code constants
    public static final String SITELAB_CURRENCY_ENGLISH="sitelab.currency.english";
    public static final String SITELAB_CURRENCY_SPANISH="sitelab.currency.spanish";
    public static final String SITELAB_CURRENCY_PORTUGESE="sitelab.currency.portugese";

    public static final String SITELAB_LANGUAGE_PARAM_KEY = "sitelab.cms.consumer.url.parameter.language.key";
    public static final String SITELAB_CHANNEL_PARAM_KEY = "sitelab.cms.consumer.url.parameter.channel.key";
    public static final String SITELAB_CHANNEL_PARAM_VALUE = "sitelab.cms.consumer.url.parameter.channel.value";
    public static final String SITELAB_LOCALE_KEY_PREFIX = "sitelab.cms.consumer.url.parameter.locale.";
    public static final String SITELAB_ENGLISH_KEY = "sitelab.cms.consumer.url.parameter.value.english";
    public static final String SITELAB_SPANISH_KEY = "sitelab.cms.consumer.url.parameter.value.spanish";
    public static final String SITELAB_POTUGESE_KEY = "sitelab.cms.consumer.url.parameter.value.portugese";
    public static final String SITELAB_BRAND_NAME_PARAM_NAME_KEY = "sitelab.cms.consumer.url.parameter.brandname";
    //public static final String SITELAB_BRAND_NAME_PARAM_VALUE_KEY ="sitelab.cms.consumer.url.parameter.brandname.value" ;
    public static final String SITELAB_BRAND_NAME_FA_PARAM_VALUE_KEY = "sitelab.cms.consumer.url.parameter.brandname.fa.value";
    public static final String SITELAB_BRAND_NAME_CP_PARAM_VALUE_KEY = "sitelab.cms.consumer.url.parameter.brandname.cp.value";
    public static final String SITELAB_BRAND_NAME_FAG_PARAM_VALUE_KEY = "sitelab.cms.consumer.url.parameter.brandname.fag.value";
    public static final String SITELAB_BRAND_NAME_AQUA_PARAM_VALUE_KEY = "sitelab.cms.consumer.url.parameter.brandname.aqua.value";
    public static final String SITELAB_BRAND_NAME_FI_PARAM_VALUE_KEY  = "sitelab.cms.consumer.url.parameter.brandname.fi.value";
    public static final String SITELAB_BRAND_NAME_CB_PARAM_VALUE_KEY  = "sitelab.cms.consumer.url.parameter.brandname.cb.value";
    public static final String SITELAB_BRAND_NAME_ONE_PARAM_VALUE_KEY  = "sitelab.cms.consumer.url.parameter.brandname.one.value";
    public static final String SITELAB_KEYWORD_PARAM_VALUE_KEY = "sitelab.cms.consumer.url.parameter.keyword";
    public static final String SITELAB_KEYWORD_HOTEL_CODE_VALUE_KEY = "sitelab.cms.consumer.url.parameter.hotelcode";
    public static final String SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_FA = "sitelab.hotelsearch.grid.image.keyword.fa";
    public static final String SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_CP = "sitelab.hotelsearch.grid.image.keyword.cp";
    public static final String SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_FAG = "sitelab.hotelsearch.grid.image.keyword.fag";
    public static final String SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_FI = "sitelab.hotelsearch.grid.image.keyword.fi";
    public static final String SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_CB = "sitelab.hotelsearch.grid.image.keyword.cb";

    public static final String SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_FA = "sitelab.destinationsearch.grid.image.keyword.fa";
    public static final String SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_CP = "sitelab.destinationsearch.grid.image.keyword.cp";
    public static final String SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_FAG = "sitelab.destinationsearch.grid.image.keyword.fag";
    public static final String SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_FI = "sitelab.destinationsearch.grid.image.keyword.fi";
    public static final String SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_CB = "sitelab.destinationsearch.grid.image.keyword.cb";

    public static final String SITELAB_LOCALE_COOKIE_NAME = "GUEST_LANGUAGE_ID";
    public static final String SITELAB_KEYWORD_CODE_VALUE_KEY = "sitelab.cms.consumer.url.parameter.code";
    public static final String SITELAB_PLACELIST_URL_PARAMETER_CODE = "sitelab.cms.placelist.url.parameter.code";
    public static final String SITELAB_KEYWORD_KEYWORD_VALUE_KEY = "sitelab.cms.consumer.url.parameter.keyword";
    public static final String SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE_HOTEL = "sitelab.minisite.custom.attribute.type.hotel";
    public static final String SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE_DESTINATION = "sitelab.minisite.custom.attribute.type.destination";
    public static final String SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE_SPECIAL_OFFER = "sitelab.minisite.custom.attribute.type.specialOffer";
    public static final String SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE = "sitelab.minisite.custom.attribute.type";
    public static final String SITELAB_MINISITE_CUSTOM_ATTRIBUTE_CODE = "sitelab.minisite.custom.attribute.code";
    public static final String SITELAB_CUSTOM_ATTRIBUTE_HOTEL_NAME = "sitelab.custom.attribute.hotel.name";
    public static final String SITELAB_DESTINATION_ATTRACTIONTYPE_PARAM_NAME_KEY="sitelab.cms.consumer.url.parameter.type";
    public static final String SITELAB_FILTER_CRITERIA="sitelab.filter.criteria";
    public static final String SITELAB_SPECIAL_OFFER_CODE_VALUE_KEY = "sitelab.cms.consumer.url.parameter.specialoffer.code";
    public static final String SITELAB_SPECIAL_OFFER_DEFAULT_KEYWORD="sitelab.special.offer.default.keyword";

    public static final String SITELAB_HOTEL_ALTERNATE_PROPERTIES_KEY="sitelab.hotel.alternate.properties.key";
    public static final String SITELAB_HOTEL_ALTERNATE_PROPERTIES_TRUE="sitelab.hotel.alternate.properties.true";
    public static final String SITELAB_HOTEL_ALTERNATE_PROPERTIES_FALSE="sitelab.hotel.alternate.properties.false";

    public static final String SLIDESHOW_FA_HOME = "fa-home";
    public static final String SLIDESHOW_FA_PROMOTION = "fa-promotion";
    public static final String SLIDESHOW_FA_MINISITE = "fa-minisite";
    public static final String SLIDESHOW_FA_COMMUNITY = "fa-community";
    public static final String SLIDESHOW_FA_SPECIAL_OFFER = "fa-special-offer";
    public static final String SLIDESHOW_FA_MINISITE_ROOM = "fa-minisite-room";

    public static final String SLIDESHOW_CP_HOME="cp-home";
    public static final String SLIDESHOW_CP_HOME_BOTTOM="cp-promotion";
    public static final String SLIDESHOW_CP_MINISITE="cp-minisite";
    public static final String SLIDESHOW_CP_SPECIAL_OFFER="cp-special-offer";
    public static final String SLIDESHOW_CP_ROOMS="cp-rooms";
    public static final String SLIDESHOW_CP_COMMUNITY="cp-community";
    public static final String SLIDESHOW_CP_DESTINATION = "cp-destination";
    public static final String SLIDESHOW_CP_DESTINATION_HOME = "cp-destination-home";
    public static final String SLIDESHOW_CP_REWARD="cp-reward";

    public static final String SLIDESHOW_AQUA_HOME = "aqua-home";
    public static final String SLIDESHOW_AQUA_SPECIAL_OFFER = "aqua-special-offer";
    public static final String SLIDESHOW_AQUA_MINISITE = "aqua-minisite";
    public static final String SLIDESHOW_AQUA_MINISITE_INTERNAL = "aqua-minisite-internal";
    public static final String SLIDESHOW_AQUA_MINISITE_INTERNAL_TOP = "aqua-minisite-internal-top";
    public static final String SLIDESHOW_AQUA_SPECIAL_OFFER_DETAIL = "aqua-special-offer-detail";

    public static final String SLIDESHOW_FAG_HOME = "fag-home";
    public static final String SLIDESHOW_FAG_SPECIAL_OFFER = "fag-special-offer";
    public static final String SLIDESHOW_FAG_HOME_SPECIAL_OFFERS = "fag-home-special-offers";
    public static final String SLIDESHOW_FAG_MINISITE_HOME = "fag-minisite-home";

    public static final String AQUA_HOME_IMAGE_CAROUSEL_CANCUN_NAME = "aqua.home.image.carousel.cancun.name";
    public static final String AQUA_HOME_IMAGE_CAROUSEL_CANCUN_URL = "aqua.home.image.carousel.cancun.url";
    public static final String AQUA_HOME_IMAGE_CAROUSEL_MEXICOCITY_NAME = "aqua.home.image.carousel.mexicocity.name";
    public static final String AQUA_HOME_IMAGE_CAROUSEL_MEXICOCITY_URL = "aqua.home.image.carousel.mexicocity.url";
    public static final String AQUA_HOME_IMAGE_CAROUSEL_ACAPULCO_NAME = "aqua.home.image.carousel.acapulco.name";
    public static final String AQUA_HOME_IMAGE_CAROUSEL_ACAPULCO_URL = "aqua.home.image.carousel.acapulco.url";

    public static final String SLIDESHOW_FI_HOME = "fi-home";
    public static final String SLIDESHOW_FI_PROMOTION = "fi-promotion";
    public static final String SLIDESHOW_FI_MINISITE_HOME = "fi-minisite-home";
    public static final String SLIDESHOW_FI_MINISITE_INSIDE = "fi-minisite-inside";
    public static final String SLIDESHOW_FI_SPECIAL_OFFER = "fi-special-offer";
    public static final String SLIDESHOW_FI_SP_PROMOTION = "fi-sp-promotion";

    public static final String SLIDESHOW_CB_HOME = "cb-home";
    public static final String SLIDESHOW_CB_PROMOTION = "cb-promotion";
    public static final String SLIDESHOW_CB_MINISITE_HOME = "cb-minisite-home";
    public static final String SLIDESHOW_CB_MINISITE_INSIDE = "cb-minisite-inside";
    public static final String SLIDESHOW_CB_SPECIAL_OFFER = "cb-special-offer";
    public static final String SLIDESHOW_CB_SP_PROMOTION = "cb-sp-promotion";

    /********************** Configuration for Hotel One portlet ****************************/
    public static final String SLIDESHOW_ONEHOTEL_HOME = "one-hotel-home";
    public static final String SLIDESHOW_ONEHOTEL_SPECIAL_OFFER = "one-hotel-special-offer";
    public static final String SLIDESHOW_ONEHOTEL_MINISITE_HOME = "one-hotel-minisite-home";
    public static final String SLIDESHOW_ONEHOTEL_MINISITE_INSIDE = "one-hotel-minisite-inside";

    public static final String SITELAB_HOTELSEARCH_RATESERVICE_FLAG = "sitelab.hotelsearch.rateservice.flag";

    public static final String SITELAB_BOOK_ROOM_ADULT_COUNT_PARAM_NAME="sitelab.book-room.adult.count.param.name";
    public static final String SITELAB_BOOK_ROOM_ADULT_COUNT_PARAM_VALUE="sitelab.book-room.adult.count.param.value";

    public static final String SITELAB_BOOK_ROOM_ROOMS_COUNT_PARAM_NAME="sitelab.book-room.room.count.param.name";
    public static final String SITELAB_BOOK_ROOM_ROOMS_COUNT_PARAM_VALUE="sitelab.book-room.room.count.param.value";

    public static final String SITELAB_BOOKHOTEL_STARTDATE = "sitelab.hotelbook.startdate";
    public static final String SITELAB_BOOKHOTEL_ENDDATE = "sitelab.hotelbook.enddate";
    public static final String SITELAB_BOOKHOTEL_URL = "sitelab.ibe-widget-available";
    public static final String SITELAB_BOOKHOTEL_URL_FA = "sitelab.ibe-widget-available-FA";
    public static final String SITELAB_BOOKHOTEL_URL_CP = "sitelab.ibe-widget-available-CP";
    public static final String SITELAB_BOOKHOTEL_URL_FAG = "sitelab.ibe-widget-available-FAG";
    public static final String SITELAB_BOOKHOTEL_HOTECODE = "sitelab.hotel.hotelCode";
    public static final String SITELAB_HOTELSEARCH_PARAM_HOTELIDS = "sitelab.hotelsearch.param.hotelids";

    public static final String SITELAB_FLICKER_USER_EMAILID = "sitelab.flickr.user.email";
    public static final String SITELAB_FLCIKER_APITKEY = "sitelab.flickr.apiKey";
    public static final String SITELAB_FLCIKER_SEARCH_TAG_FA = "sitelab.flickr.search.tag.fa";
    public static final String SITELAB_FLCIKER_SEARCH_TAG_CP = "sitelab.flickr.search.tag.cp";
    public static final String SITELAB_FLCIKER_SEARCH_TAG_FAG = "sitelab.flickr.search.tag.fag";
    public static final String SITELAB_FLCIKER_SEARCH_TAG_AUQA = "sitelab.flickr.search.tag.aqua";
    public static final String SITELAB_FLCIKER_REST_URL = "sitelab.flickr.rest.url";
    public static final String SITELAB_FLCIKER_STATIC_URL = "sitelab.flickr.static.url";
    public static final String SITELAB_GUID = "guid";
    public static final String SITELAB_FORWARD_PREFIX_URL = "sitelab.forward.prefix.url";


    public static final String SITELAB_BOOKAPACKAGE_SITELAB_CROM = "sitelab.crom";
    public static final String SITELAB_BOOKAPACKAGE_SITELAB_EAPID = "sitelab.pkg.eapid";
    public static final String SITELAB_BOOKAPACKAGE_SITELAB_TRTN1 = "sitelab.trtn1";
    public static final String SITELAB_BOOKAPACKAGE_SITELAB_TDPT1 = "sitelab.tdpt1";
    public static final String SITELAB_BOOKAPACKAGE_SITELAB_EXP_CITYCODE = "sitelab.exp.citycode";

    public static final String SITELAB_BOOKNOW_URL_PARAM_GROUP = "sitelab.groupcode";
    public static final String SITELAB_BOOKNOW_URL_PARAM_PROMOTION = "sitelab.promocode";
    public static final String SITELAB_BOOKNOW_URL_PARAM_AGREEMENT = "sitelab.agreement";
    public static final String SITELAB_BOOKNOW_URL_PARAM_CHILDREN = "sitelab.numchild";
    public static final String SITELAB_BOOKNOW_URL_PARAM_CHILDREN_VALUE = "sitelab.booknow.children.default";


    public static final String SITELAB_BOOKNOW_URL_PARAM_DESTINO = "sitelab.suggest13";
    public static final String SITELAB_BOOKNOW_URL_PARAM_INFANTS = "sitelab.numinfant";

    /*
     * Constants for Google Map portlet
     */
    public static final String GOOGLE_MAP_KEY=PropsUtil.get("sitelab.google-map-key");
    public static final String GOOGLE_MAP_ADD=PropsUtil.get("sitelab.google-map-address");
    public static final boolean IS_MAP_INPUT_ENABLED=false;
    public static final String MAP_DIRECTION_ADDRESS=PropsUtil.get("sitelab.directions-address");
    public static final boolean IS_DIRECTION_INPUT_ENABLED=false;
    public static final String GOOGLE_MAP_HEIGHT="300";

    //********************* Google Map Portlet Constant Ends here *********************************



    //----------IbeWidgetController constants--------------
    public static final String HOTEL_CODE = PropsUtil.get("sitelab.hotel.hotelCode");

    public static final String HOTEL_NAME = PropsUtil.get("sitelab.hotel.hotelName");
    public static final String CITY_CODE = PropsUtil.get("sitelab.hotel.cityCode");
    public static final String COUNTRY_CODE = PropsUtil.get("sitelab.hotel.countryCode");
    public static final String NUMBER_OF_INFANTS = PropsUtil.get("sitelab.number-of-infants");
    public static final String IBE_IATA = PropsUtil.get("sitelab.iata");
    public static final String IBE_MARCA = PropsUtil.get("sitelab.marca");
    public static final String IBE_MODE = PropsUtil.get("sitelab.ibe-mode");
    public static final String IBE_DOMINIO = PropsUtil.get("sitelab.dominio");

    public static final String IBE_MARCADESC_FA = "sitelab.marcadesc-FA";
    public static final String IBE_MARCADESC_CP = "sitelab.marcadesc-CP";
    public static final String IBE_MARCADESC_AQU = "sitelab.marcadesc-AQU";
    public static final String IBE_MARCADESC_FAG = "sitelab.marcadesc-FAG";
    public static final String IBE_MARCADESC_FIN = "sitelab.marcadesc-FIN";
    public static final String IBE_MARCADESC_CB = "sitelab.marcadesc-CB";
    public static final String IBE_MARCADESC_ONE = "sitelab.marcadesc-ONE";
    public static final String IBE_MARCADESC_DEFAULT = "sitelab.marcadesc-DEFAULT";

    public static final String IBE_HOTEL = PropsUtil.get("sitelab.hotel");
    public static final String IBE_HOTEL_TYPE = PropsUtil.get("sitelab.hotel-type");

    public static final String HOTEL_SEARCH_REDIRECT = PropsUtil.get("sitelab.hotel.search.redirect.url");
    public static final String FLAG = PropsUtil.get("ibe-widget-jsp");
    public static final String IBE_WIDGET_AVAILABLE = "sitelab.ibe-widget-available-";
    public static final String IBE_WIDGET_AVAILABLE_FA = "sitelab.ibe-widget-available-FA";
    public static final String IBE_WIDGET_AVAILABLE_CP = "sitelab.ibe-widget-available-CP";
    public static final String IBE_WIDGET_AVAILABLE_AQU = "sitelab.ibe-widget-available-AQUA";
    public static final String IBE_WIDGET_AVAILABLE_FAG = "sitelab.ibe-widget-available-FAG";
    public static final String IBE_WIDGET_AVAILABLE_FIN = "sitelab.ibe-widget-available-FI";
    public static final String IBE_WIDGET_AVAILABLE_CB = "sitelab.ibe-widget-available-CB";
    public static final String IBE_WIDGET_AVAILABLE_ONE = "sitelab.ibe-widget-available-ONE";
    public static final String IBE_WIDGET_AVAILABLE_DEFAULT = "sitelab.ibe-widget-available-DEFAULT";

    public static final String BOOK_PACKAGE_URL = PropsUtil.get("sitelab.book-package-url");
    public static final String BOOK_PACKAGE_URL_FA_FAG_AQUA = PropsUtil.get("sitelab.book-package-url-FA-AQUA-FAG");
    public static final String IBE_LOGIN_URL = "sitelab.ibe-login-url";
    public static final String IBE_LOGIN_REGISTERED_EMAIL = "sitelab.login.registeredEmail";
    public static final String IBE_LOGIN_SUCCESS_URL = "sitelab.ibe-login-success-url";
    public static final String IBE_QUICK_LOGIN_URL = "sitelab.ibe-quick-login-url";
    public static final String IBE_LOGIN_TYPE_JSON = "sitelab.login-type-json";
    public static final String IBE_LOGIN_KEEP_ME = "sitelab.keep-me";
    public static final String IBE_LOGIN_PWD_NOTENC = "sitelab.login-password-notencrypted";
    public static final String IBE_LOGIN_BRAND = "sitelab.login-brand";
    //connection time out
    public static final String SITELAB_IBE_CONNECTION_TIMEOUT="sitelab.ibe.connection.timeout";


    public static final String HOTEL_SEARCH_PAGE_URL = PropsUtil.get("sitelab.hotel-search-page-url-FA");
    public static final String HOTEL_SEARCH_PAGE_URL_FA = PropsUtil.get("sitelab.hotel-search-page-url-FA");
    public static final String HOTEL_SEARCH_PAGE_URL_CP = PropsUtil.get("sitelab.hotel-search-page-url-CP");
    public static final String HOTEL_SEARCH_PAGE_URL_FAG = PropsUtil.get("sitelab.hotel-search-page-url-FAG");

    public static final String HOTEL_SEARCH_PAGE_URL_CB = PropsUtil.get("sitelab.hotel-search-page-url-CB");
    public static final String HOTEL_SEARCH_PAGE_URL_FI = PropsUtil.get("sitelab.hotel-search-page-url-FI");
    public static final String HOTEL_SEARCH_PAGE_URL_ONE = PropsUtil.get("sitelab.hotel-search-page-url-ONE");

    public static final String SITELAB_IDIOMA = PropsUtil.get("sitelab.idioma");
    public static final String SITELAB_IBE_WIDGET_COMBOHOTEL_PREFIX  = "sitelab.ibe.widget.comboHotelToJSON.";
    public static final String SITELAB_IBE_WIDGET_AUTOCOMPLETE_PREFIX  = "sitelab.ibe.widget.hotelNameOrCountryOrCityAutocomplete.";
    public static final String UTF8="UTF-8";

    public static final String HOTEL_FLIGHT_CAR_PARAM_KEY = "hotel.flight.car.param";
    public static final String HOTEL_FLIGHT_PARAM_KEY = "hotel.flight.param";
    public static final String HOTEL_CAR_PARAM_KEY = "hotel.car.param";
    public static final String FLIGHT_PARAM_KEY = "flight.param";
    public static final String CAR_PARAM_KEY = "car.param";
    public static final String ACTIVITIES_PARAM_KEY = "activities.param";
    public static final String SITELAB_IBE_HOST_URL = "sitelab.ibe.host.url";
    public static final String SITELAB_IBE_HOST_URL_HTTP = "sitelab.ibe.host.url.http";
    public static final String SITELAB_IBE_AQUA_HOTEL_NAME = "sitelab.ibe.aqua.hotel.name";
    public static final String SITELAB_IBE_WIDGET_ALL_INCLUSIVE_HOTELS = "sitelab.ibe.widget.all.inclusive.hotels";
    //----------IbeWidgetController constants--------------

    //----------IbeWidgetController show all url constants--------------
    //public static final String IBE_SHOWALL_ORGN_FA="sitelab.hotel.showall.orgn-name-fa";
    public static final String IBE_SHOWALL_ORGN_FA_URL="sitelab.hotel.showall.fa.url";

    //public static final String IBE_SHOWALL_ORGN_CP="sitelab.hotel.showall.orgn-name-cp";
    public static final String IBE_SHOWALL_ORGN_CP_URL="sitelab.hotel.showall.cp.url";

    //----------- Item List controller -----------------

    //----------- Attraction Type Controller -----------
    public static final String SITELAB_DESTINATION_NOOFATTRACTIONS="sitelab.destination.noOfattractions";
    public static final String SITELAB_DESTINATION_ATTRACTIONTYPE ="sitelab.destination.attractions";

    public static final String HOTEL_SEARCH_SHOW_ALL ="hotelsearchshowall";

    public static final String TRAVEL_AGENCY_EMAIL_TO="sitelab.travelagencyupdate.emailto";
    public static final String TRAVEL_AGENCY_EMAIL_FROM="sitelab.travelagencyupdate.emailfrom";

    public static final String BRAND_NAME_KEY_PREFIX = "sitelab";
    public static final String BRAND_NAME_KEY_SEPRATOR = ".";
    public static final String BRAND_NAME_KEY_POSTFIX = "code";

    public static final String SITELAB_CP_FILTER_KEYWORD = "sitelab.cp.multimedia.keyword";

    public static final String SITELAB_FAG_ROOMS_TYPE_JUNIORSUITS = "sitelab.fag.rooms.type.juniorsuits";

    public static final String SITELAB_FAG_ROOMS_TYPE_STANDARDSUITS = "sitelab.fag.rooms.type.standardsuits";

    public static final String SITELAB_FACILITY_DINING_POPUP = "sitelab.facility.dining.popup";
    public static final String SITELAB_FACILITY_RESTAURANT_POPUP = "sitelab.facility.restaurant.popup";

    public static final String SITELAB_FACILITY_FIESTA_KIDS_POPUP = "sitelab.facility.fiesta.kids.popup";
    public static final String SITELAB_FACILITY_SPA_POPUP = "sitelab.facility.spa.popup";
    public static final String SITELAB_FACILITY_MEETING_EVENTS_POPUP = "sitelab.facility.meeting.events.popup";
    public static final String SITELAB_NET_CONNECTION_TIMEOUT = "sitelab.net.connection.timeout";

    public static final String SITELAB_HOTEL_SEARCH_DEFAULT_RECORD_PER_PAGE = "sitelab.hotel.search.default.record.per.page";

    public static final String TRAVEL_AGENCY_EMAIL_SUBJECT = "sitelab.travelagency.email.subject";

    public static final String SITELAB_GOOGLE_MAP_SCRIPT_FILE_PATH = "sitelab.google-map.script.path";

    public static final String SITELAB_OUTGOING_URL_TRIM_TOKENS = "sitelab.outgoing.url.trim.tokens";

    public static final String SITELAB_CMS_CONSUMER_URL_DEFAULT_LANGUAGE = "sitelab.cms.consumer.url.default.language";

    public static final int HOTEL_IMAGECAROUSEL_IMG_ALT_TAG = 1;
    public static final int DESTINAION_IMAGECAROUSEL_IMG_ALT_TAG = 2;
    public static final int FACILITY_IMG_ALT_TAG = 3;
    public static final int HOTE_ROOMS_IMAGE_ALT_TAG = 4;
    public static final int HOTEL_SEARCH_IMAGE_ALT_TAG = 5;
    public static final int DESTINATION_SEARCH_IMAGE_ALT_TAG = 6;
    public static final int SPECIAL_OFFER_SEARCH_IMAGE_ALT_TAG = 7;

    public static final String SITELAB_IBE_URL_PARAM_BRAND_CODE = "sitelab.ibe.url.param.brandcode";

	public static String getSITELAB_HOSTNAME_PORT() {
		return SITELAB_HOSTNAME_PORT;
	}

	public static void setSITELAB_HOSTNAME_PORT(String sITELAB_HOSTNAME_PORT) {
		SITELAB_HOSTNAME_PORT = sITELAB_HOSTNAME_PORT;
	}

	public static String getSitelabHotelCodeKey() {
		return SITELAB_HOTEL_CODE_KEY;
	}

	public static String getSitelabDestinationCodeKey() {
		return SITELAB_DESTINATION_CODE_KEY;
	}

	public static String getSitelabImageThumbnail() {
		return SITELAB_IMAGE_THUMBNAIL;
	}

	public static String getSitelabImageTiny() {
		return SITELAB_IMAGE_TINY;
	}

	public static String getSitelabImageTinyWide() {
		return SITELAB_IMAGE_TINY_WIDE;
	}

	public static String getSitelabImageTinyWideA() {
		return SITELAB_IMAGE_TINY_WIDE_A;
	}

	public static String getSitelabImageTinyWideB() {
		return SITELAB_IMAGE_TINY_WIDE_B;
	}

	public static String getSitelabImageSmall() {
		return SITELAB_IMAGE_SMALL;
	}

	public static String getSitelabImageSmallWide() {
		return SITELAB_IMAGE_SMALL_WIDE;
	}

	public static String getSitelabImageNewLarge() {
		return SITELAB_IMAGE_NEW_LARGE;
	}

	public static String getSitelabImageMedium() {
		return SITELAB_IMAGE_MEDIUM;
	}

	public static String getSitelabImageMediumSmall() {
		return SITELAB_IMAGE_MEDIUM_SMALL;
	}

	public static String getSitelabImageMediumWide() {
		return SITELAB_IMAGE_MEDIUM_WIDE;
	}

	public static String getSitelabImageMediumWideA() {
		return SITELAB_IMAGE_MEDIUM_WIDE_A;
	}

	public static String getSitelabImageMediumDoubleWide() {
		return SITELAB_IMAGE_MEDIUM_DOUBLE_WIDE;
	}

	public static String getSitelabImageMediumDoubleWideA() {
		return SITELAB_IMAGE_MEDIUM_DOUBLE_WIDE_A;
	}

	public static String getSitelabImageBig() {
		return SITELAB_IMAGE_BIG;
	}

	public static String getSitelabImageBigWide() {
		return SITELAB_IMAGE_BIG_WIDE;
	}

	public static String getSitelabImageLargeHalfWide() {
		return SITELAB_IMAGE_LARGE_HALF_WIDE;
	}

	public static String getSitelabImageTinyTripleWide() {
		return SITELAB_IMAGE_TINY_TRIPLE_WIDE;
	}

	public static String getSitelabImageMediumTripleWide() {
		return SITELAB_IMAGE_MEDIUM_TRIPLE_WIDE;
	}

	public static String getSitelabImageMediumDoubleWideB() {
		return SITELAB_IMAGE_MEDIUM_DOUBLE_WIDE_B;
	}

	public static String getSitelabImageBigDoubleWide() {
		return SITELAB_IMAGE_BIG_DOUBLE_WIDE;
	}

	public static String getSitelabImageIconTripleWide() {
		return SITELAB_IMAGE_ICON_TRIPLE_WIDE;
	}

	public static String getSitelabImageLargeWide() {
		return SITELAB_IMAGE_LARGE_WIDE;
	}

	public static String getSitelabImageLandingSmall() {
		return SITELAB_IMAGE_LANDING_SMALL;
	}

	public static String getSitelabImageLandingBigC() {
		return SITELAB_IMAGE_LANDING_BIG_C;
	}

	public static String getSitelabImageNewMedium() {
		return SITELAB_IMAGE_NEW_MEDIUM;
	}

	public static String getSitelabImageTinyA() {
		return SITELAB_IMAGE_TINY_A;
	}

	public static String getSitelabImageMediumIcon() {
		return SITELAB_IMAGE_MEDIUM_ICON;
	}

	public static String getSitelabLanguageEnglishKey() {
		return SITELAB_LANGUAGE_ENGLISH_KEY;
	}

	public static String getSitelabLanguageSpanishKey() {
		return SITELAB_LANGUAGE_SPANISH_KEY;
	}

	public static String getSitelabLanguagePotugeseKey() {
		return SITELAB_LANGUAGE_POTUGESE_KEY;
	}

	public static String getSitelabCurrencyEnglish() {
		return SITELAB_CURRENCY_ENGLISH;
	}

	public static String getSitelabCurrencySpanish() {
		return SITELAB_CURRENCY_SPANISH;
	}

	public static String getSitelabCurrencyPortugese() {
		return SITELAB_CURRENCY_PORTUGESE;
	}

	public static String getSitelabLanguageParamKey() {
		return SITELAB_LANGUAGE_PARAM_KEY;
	}

	public static String getSitelabChannelParamKey() {
		return SITELAB_CHANNEL_PARAM_KEY;
	}

	public static String getSitelabChannelParamValue() {
		return SITELAB_CHANNEL_PARAM_VALUE;
	}

	public static String getSitelabLocaleKeyPrefix() {
		return SITELAB_LOCALE_KEY_PREFIX;
	}

	public static String getSitelabEnglishKey() {
		return SITELAB_ENGLISH_KEY;
	}

	public static String getSitelabSpanishKey() {
		return SITELAB_SPANISH_KEY;
	}

	public static String getSitelabPotugeseKey() {
		return SITELAB_POTUGESE_KEY;
	}

	public static String getSitelabBrandNameParamNameKey() {
		return SITELAB_BRAND_NAME_PARAM_NAME_KEY;
	}

	public static String getSitelabBrandNameFaParamValueKey() {
		return SITELAB_BRAND_NAME_FA_PARAM_VALUE_KEY;
	}

	public static String getSitelabBrandNameCpParamValueKey() {
		return SITELAB_BRAND_NAME_CP_PARAM_VALUE_KEY;
	}

	public static String getSitelabBrandNameFagParamValueKey() {
		return SITELAB_BRAND_NAME_FAG_PARAM_VALUE_KEY;
	}

	public static String getSitelabBrandNameAquaParamValueKey() {
		return SITELAB_BRAND_NAME_AQUA_PARAM_VALUE_KEY;
	}

	public static String getSitelabBrandNameFiParamValueKey() {
		return SITELAB_BRAND_NAME_FI_PARAM_VALUE_KEY;
	}

	public static String getSitelabBrandNameCbParamValueKey() {
		return SITELAB_BRAND_NAME_CB_PARAM_VALUE_KEY;
	}

	public static String getSitelabBrandNameOneParamValueKey() {
		return SITELAB_BRAND_NAME_ONE_PARAM_VALUE_KEY;
	}

	public static String getSitelabKeywordParamValueKey() {
		return SITELAB_KEYWORD_PARAM_VALUE_KEY;
	}

	public static String getSitelabKeywordHotelCodeValueKey() {
		return SITELAB_KEYWORD_HOTEL_CODE_VALUE_KEY;
	}

	public static String getSitelabHotelsearchGridImageKeywordFa() {
		return SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_FA;
	}

	public static String getSitelabHotelsearchGridImageKeywordCp() {
		return SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_CP;
	}

	public static String getSitelabHotelsearchGridImageKeywordFag() {
		return SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_FAG;
	}

	public static String getSitelabHotelsearchGridImageKeywordFi() {
		return SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_FI;
	}

	public static String getSitelabHotelsearchGridImageKeywordCb() {
		return SITELAB_HOTELSEARCH_GRID_IMAGE_KEYWORD_CB;
	}

	public static String getSitelabDestinationsearchGridImageKeywordFa() {
		return SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_FA;
	}

	public static String getSitelabDestinationsearchGridImageKeywordCp() {
		return SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_CP;
	}

	public static String getSitelabDestinationsearchGridImageKeywordFag() {
		return SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_FAG;
	}

	public static String getSitelabDestinationsearchGridImageKeywordFi() {
		return SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_FI;
	}

	public static String getSitelabDestinationsearchGridImageKeywordCb() {
		return SITELAB_DESTINATIONSEARCH_GRID_IMAGE_KEYWORD_CB;
	}

	public static String getSitelabLocaleCookieName() {
		return SITELAB_LOCALE_COOKIE_NAME;
	}

	public static String getSitelabKeywordCodeValueKey() {
		return SITELAB_KEYWORD_CODE_VALUE_KEY;
	}

	public static String getSitelabPlacelistUrlParameterCode() {
		return SITELAB_PLACELIST_URL_PARAMETER_CODE;
	}

	public static String getSitelabKeywordKeywordValueKey() {
		return SITELAB_KEYWORD_KEYWORD_VALUE_KEY;
	}

	public static String getSitelabMinisiteCustomAttributeTypeHotel() {
		return SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE_HOTEL;
	}

	public static String getSitelabMinisiteCustomAttributeTypeDestination() {
		return SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE_DESTINATION;
	}

	public static String getSitelabMinisiteCustomAttributeTypeSpecialOffer() {
		return SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE_SPECIAL_OFFER;
	}

	public static String getSitelabMinisiteCustomAttributeType() {
		return SITELAB_MINISITE_CUSTOM_ATTRIBUTE_TYPE;
	}

	public static String getSitelabMinisiteCustomAttributeCode() {
		return SITELAB_MINISITE_CUSTOM_ATTRIBUTE_CODE;
	}

	public static String getSitelabCustomAttributeHotelName() {
		return SITELAB_CUSTOM_ATTRIBUTE_HOTEL_NAME;
	}

	public static String getSitelabDestinationAttractiontypeParamNameKey() {
		return SITELAB_DESTINATION_ATTRACTIONTYPE_PARAM_NAME_KEY;
	}

	public static String getSitelabFilterCriteria() {
		return SITELAB_FILTER_CRITERIA;
	}

	public static String getSitelabSpecialOfferCodeValueKey() {
		return SITELAB_SPECIAL_OFFER_CODE_VALUE_KEY;
	}

	public static String getSitelabSpecialOfferDefaultKeyword() {
		return SITELAB_SPECIAL_OFFER_DEFAULT_KEYWORD;
	}

	public static String getSitelabHotelAlternatePropertiesKey() {
		return SITELAB_HOTEL_ALTERNATE_PROPERTIES_KEY;
	}

	public static String getSitelabHotelAlternatePropertiesTrue() {
		return SITELAB_HOTEL_ALTERNATE_PROPERTIES_TRUE;
	}

	public static String getSitelabHotelAlternatePropertiesFalse() {
		return SITELAB_HOTEL_ALTERNATE_PROPERTIES_FALSE;
	}

	public static String getSlideshowFaHome() {
		return SLIDESHOW_FA_HOME;
	}

	public static String getSlideshowFaPromotion() {
		return SLIDESHOW_FA_PROMOTION;
	}

	public static String getSlideshowFaMinisite() {
		return SLIDESHOW_FA_MINISITE;
	}

	public static String getSlideshowFaCommunity() {
		return SLIDESHOW_FA_COMMUNITY;
	}

	public static String getSlideshowFaSpecialOffer() {
		return SLIDESHOW_FA_SPECIAL_OFFER;
	}

	public static String getSlideshowFaMinisiteRoom() {
		return SLIDESHOW_FA_MINISITE_ROOM;
	}

	public static String getSlideshowCpHome() {
		return SLIDESHOW_CP_HOME;
	}

	public static String getSlideshowCpHomeBottom() {
		return SLIDESHOW_CP_HOME_BOTTOM;
	}

	public static String getSlideshowCpMinisite() {
		return SLIDESHOW_CP_MINISITE;
	}

	public static String getSlideshowCpSpecialOffer() {
		return SLIDESHOW_CP_SPECIAL_OFFER;
	}

	public static String getSlideshowCpRooms() {
		return SLIDESHOW_CP_ROOMS;
	}

	public static String getSlideshowCpCommunity() {
		return SLIDESHOW_CP_COMMUNITY;
	}

	public static String getSlideshowCpDestination() {
		return SLIDESHOW_CP_DESTINATION;
	}

	public static String getSlideshowCpDestinationHome() {
		return SLIDESHOW_CP_DESTINATION_HOME;
	}

	public static String getSlideshowCpReward() {
		return SLIDESHOW_CP_REWARD;
	}

	public static String getSlideshowAquaHome() {
		return SLIDESHOW_AQUA_HOME;
	}

	public static String getSlideshowAquaSpecialOffer() {
		return SLIDESHOW_AQUA_SPECIAL_OFFER;
	}

	public static String getSlideshowAquaMinisite() {
		return SLIDESHOW_AQUA_MINISITE;
	}

	public static String getSlideshowAquaMinisiteInternal() {
		return SLIDESHOW_AQUA_MINISITE_INTERNAL;
	}

	public static String getSlideshowAquaMinisiteInternalTop() {
		return SLIDESHOW_AQUA_MINISITE_INTERNAL_TOP;
	}

	public static String getSlideshowAquaSpecialOfferDetail() {
		return SLIDESHOW_AQUA_SPECIAL_OFFER_DETAIL;
	}

	public static String getSlideshowFagHome() {
		return SLIDESHOW_FAG_HOME;
	}

	public static String getSlideshowFagSpecialOffer() {
		return SLIDESHOW_FAG_SPECIAL_OFFER;
	}

	public static String getSlideshowFagHomeSpecialOffers() {
		return SLIDESHOW_FAG_HOME_SPECIAL_OFFERS;
	}

	public static String getSlideshowFagMinisiteHome() {
		return SLIDESHOW_FAG_MINISITE_HOME;
	}

	public static String getAquaHomeImageCarouselCancunName() {
		return AQUA_HOME_IMAGE_CAROUSEL_CANCUN_NAME;
	}

	public static String getAquaHomeImageCarouselCancunUrl() {
		return AQUA_HOME_IMAGE_CAROUSEL_CANCUN_URL;
	}

	public static String getAquaHomeImageCarouselMexicocityName() {
		return AQUA_HOME_IMAGE_CAROUSEL_MEXICOCITY_NAME;
	}

	public static String getAquaHomeImageCarouselMexicocityUrl() {
		return AQUA_HOME_IMAGE_CAROUSEL_MEXICOCITY_URL;
	}

	public static String getAquaHomeImageCarouselAcapulcoName() {
		return AQUA_HOME_IMAGE_CAROUSEL_ACAPULCO_NAME;
	}

	public static String getAquaHomeImageCarouselAcapulcoUrl() {
		return AQUA_HOME_IMAGE_CAROUSEL_ACAPULCO_URL;
	}

	public static String getSlideshowFiHome() {
		return SLIDESHOW_FI_HOME;
	}

	public static String getSlideshowFiPromotion() {
		return SLIDESHOW_FI_PROMOTION;
	}

	public static String getSlideshowFiMinisiteHome() {
		return SLIDESHOW_FI_MINISITE_HOME;
	}

	public static String getSlideshowFiMinisiteInside() {
		return SLIDESHOW_FI_MINISITE_INSIDE;
	}

	public static String getSlideshowFiSpecialOffer() {
		return SLIDESHOW_FI_SPECIAL_OFFER;
	}

	public static String getSlideshowFiSpPromotion() {
		return SLIDESHOW_FI_SP_PROMOTION;
	}

	public static String getSlideshowCbHome() {
		return SLIDESHOW_CB_HOME;
	}

	public static String getSlideshowCbPromotion() {
		return SLIDESHOW_CB_PROMOTION;
	}

	public static String getSlideshowCbMinisiteHome() {
		return SLIDESHOW_CB_MINISITE_HOME;
	}

	public static String getSlideshowCbMinisiteInside() {
		return SLIDESHOW_CB_MINISITE_INSIDE;
	}

	public static String getSlideshowCbSpecialOffer() {
		return SLIDESHOW_CB_SPECIAL_OFFER;
	}

	public static String getSlideshowCbSpPromotion() {
		return SLIDESHOW_CB_SP_PROMOTION;
	}

	public static String getSlideshowOnehotelHome() {
		return SLIDESHOW_ONEHOTEL_HOME;
	}

	public static String getSlideshowOnehotelSpecialOffer() {
		return SLIDESHOW_ONEHOTEL_SPECIAL_OFFER;
	}

	public static String getSlideshowOnehotelMinisiteHome() {
		return SLIDESHOW_ONEHOTEL_MINISITE_HOME;
	}

	public static String getSlideshowOnehotelMinisiteInside() {
		return SLIDESHOW_ONEHOTEL_MINISITE_INSIDE;
	}

	public static String getSitelabHotelsearchRateserviceFlag() {
		return SITELAB_HOTELSEARCH_RATESERVICE_FLAG;
	}

	public static String getSitelabBookRoomAdultCountParamName() {
		return SITELAB_BOOK_ROOM_ADULT_COUNT_PARAM_NAME;
	}

	public static String getSitelabBookRoomAdultCountParamValue() {
		return SITELAB_BOOK_ROOM_ADULT_COUNT_PARAM_VALUE;
	}

	public static String getSitelabBookRoomRoomsCountParamName() {
		return SITELAB_BOOK_ROOM_ROOMS_COUNT_PARAM_NAME;
	}

	public static String getSitelabBookRoomRoomsCountParamValue() {
		return SITELAB_BOOK_ROOM_ROOMS_COUNT_PARAM_VALUE;
	}

	public static String getSitelabBookhotelStartdate() {
		return SITELAB_BOOKHOTEL_STARTDATE;
	}

	public static String getSitelabBookhotelEnddate() {
		return SITELAB_BOOKHOTEL_ENDDATE;
	}

	public static String getSitelabBookhotelUrl() {
		return SITELAB_BOOKHOTEL_URL;
	}

	public static String getSitelabBookhotelUrlFa() {
		return SITELAB_BOOKHOTEL_URL_FA;
	}

	public static String getSitelabBookhotelUrlCp() {
		return SITELAB_BOOKHOTEL_URL_CP;
	}

	public static String getSitelabBookhotelUrlFag() {
		return SITELAB_BOOKHOTEL_URL_FAG;
	}

	public static String getSitelabBookhotelHotecode() {
		return SITELAB_BOOKHOTEL_HOTECODE;
	}

	public static String getSitelabHotelsearchParamHotelids() {
		return SITELAB_HOTELSEARCH_PARAM_HOTELIDS;
	}

	public static String getSitelabFlickerUserEmailid() {
		return SITELAB_FLICKER_USER_EMAILID;
	}

	public static String getSitelabFlcikerApitkey() {
		return SITELAB_FLCIKER_APITKEY;
	}

	public static String getSitelabFlcikerSearchTagFa() {
		return SITELAB_FLCIKER_SEARCH_TAG_FA;
	}

	public static String getSitelabFlcikerSearchTagCp() {
		return SITELAB_FLCIKER_SEARCH_TAG_CP;
	}

	public static String getSitelabFlcikerSearchTagFag() {
		return SITELAB_FLCIKER_SEARCH_TAG_FAG;
	}

	public static String getSitelabFlcikerSearchTagAuqa() {
		return SITELAB_FLCIKER_SEARCH_TAG_AUQA;
	}

	public static String getSitelabFlcikerRestUrl() {
		return SITELAB_FLCIKER_REST_URL;
	}

	public static String getSitelabFlcikerStaticUrl() {
		return SITELAB_FLCIKER_STATIC_URL;
	}

	public static String getSitelabGuid() {
		return SITELAB_GUID;
	}

	public static String getSitelabForwardPrefixUrl() {
		return SITELAB_FORWARD_PREFIX_URL;
	}

	public static String getSitelabBookapackageSitelabCrom() {
		return SITELAB_BOOKAPACKAGE_SITELAB_CROM;
	}

	public static String getSitelabBookapackageSitelabEapid() {
		return SITELAB_BOOKAPACKAGE_SITELAB_EAPID;
	}

	public static String getSitelabBookapackageSitelabTrtn1() {
		return SITELAB_BOOKAPACKAGE_SITELAB_TRTN1;
	}

	public static String getSitelabBookapackageSitelabTdpt1() {
		return SITELAB_BOOKAPACKAGE_SITELAB_TDPT1;
	}

	public static String getSitelabBookapackageSitelabExpCitycode() {
		return SITELAB_BOOKAPACKAGE_SITELAB_EXP_CITYCODE;
	}

	public static String getSitelabBooknowUrlParamGroup() {
		return SITELAB_BOOKNOW_URL_PARAM_GROUP;
	}

	public static String getSitelabBooknowUrlParamPromotion() {
		return SITELAB_BOOKNOW_URL_PARAM_PROMOTION;
	}

	public static String getSitelabBooknowUrlParamAgreement() {
		return SITELAB_BOOKNOW_URL_PARAM_AGREEMENT;
	}

	public static String getSitelabBooknowUrlParamChildren() {
		return SITELAB_BOOKNOW_URL_PARAM_CHILDREN;
	}

	public static String getSitelabBooknowUrlParamChildrenValue() {
		return SITELAB_BOOKNOW_URL_PARAM_CHILDREN_VALUE;
	}

	public static String getSitelabBooknowUrlParamDestino() {
		return SITELAB_BOOKNOW_URL_PARAM_DESTINO;
	}

	public static String getSitelabBooknowUrlParamInfants() {
		return SITELAB_BOOKNOW_URL_PARAM_INFANTS;
	}

	public static String getGoogleMapKey() {
		return GOOGLE_MAP_KEY;
	}

	public static String getGoogleMapAdd() {
		return GOOGLE_MAP_ADD;
	}

	public static boolean isMapInputEnabled() {
		return IS_MAP_INPUT_ENABLED;
	}

	public static String getMapDirectionAddress() {
		return MAP_DIRECTION_ADDRESS;
	}

	public static boolean isDirectionInputEnabled() {
		return IS_DIRECTION_INPUT_ENABLED;
	}

	public static String getGoogleMapHeight() {
		return GOOGLE_MAP_HEIGHT;
	}

	public static String getHotelCode() {
		return HOTEL_CODE;
	}

	public static String getHotelName() {
		return HOTEL_NAME;
	}

	public static String getCityCode() {
		return CITY_CODE;
	}

	public static String getCountryCode() {
		return COUNTRY_CODE;
	}

	public static String getNumberOfInfants() {
		return NUMBER_OF_INFANTS;
	}

	public static String getIbeIata() {
		return IBE_IATA;
	}

	public static String getIbeMarca() {
		return IBE_MARCA;
	}

	public static String getIbeMode() {
		return IBE_MODE;
	}

	public static String getIbeDominio() {
		return IBE_DOMINIO;
	}

	public static String getIbeMarcadescFa() {
		return IBE_MARCADESC_FA;
	}

	public static String getIbeMarcadescCp() {
		return IBE_MARCADESC_CP;
	}

	public static String getIbeMarcadescAqu() {
		return IBE_MARCADESC_AQU;
	}

	public static String getIbeMarcadescFag() {
		return IBE_MARCADESC_FAG;
	}

	public static String getIbeMarcadescFin() {
		return IBE_MARCADESC_FIN;
	}

	public static String getIbeMarcadescCb() {
		return IBE_MARCADESC_CB;
	}

	public static String getIbeMarcadescOne() {
		return IBE_MARCADESC_ONE;
	}

	public static String getIbeMarcadescDefault() {
		return IBE_MARCADESC_DEFAULT;
	}

	public static String getIbeHotel() {
		return IBE_HOTEL;
	}

	public static String getIbeHotelType() {
		return IBE_HOTEL_TYPE;
	}

	public static String getHotelSearchRedirect() {
		return HOTEL_SEARCH_REDIRECT;
	}

	public static String getFlag() {
		return FLAG;
	}

	public static String getIbeWidgetAvailable() {
		return IBE_WIDGET_AVAILABLE;
	}

	public static String getIbeWidgetAvailableFa() {
		return IBE_WIDGET_AVAILABLE_FA;
	}

	public static String getIbeWidgetAvailableCp() {
		return IBE_WIDGET_AVAILABLE_CP;
	}

	public static String getIbeWidgetAvailableAqu() {
		return IBE_WIDGET_AVAILABLE_AQU;
	}

	public static String getIbeWidgetAvailableFag() {
		return IBE_WIDGET_AVAILABLE_FAG;
	}

	public static String getIbeWidgetAvailableFin() {
		return IBE_WIDGET_AVAILABLE_FIN;
	}

	public static String getIbeWidgetAvailableCb() {
		return IBE_WIDGET_AVAILABLE_CB;
	}

	public static String getIbeWidgetAvailableOne() {
		return IBE_WIDGET_AVAILABLE_ONE;
	}

	public static String getIbeWidgetAvailableDefault() {
		return IBE_WIDGET_AVAILABLE_DEFAULT;
	}

	public static String getBookPackageUrl() {
		return BOOK_PACKAGE_URL;
	}

	public static String getBookPackageUrlFaFagAqua() {
		return BOOK_PACKAGE_URL_FA_FAG_AQUA;
	}

	public static String getIbeLoginUrl() {
		return IBE_LOGIN_URL;
	}

	public static String getIbeLoginRegisteredEmail() {
		return IBE_LOGIN_REGISTERED_EMAIL;
	}

	public static String getIbeLoginSuccessUrl() {
		return IBE_LOGIN_SUCCESS_URL;
	}

	public static String getIbeQuickLoginUrl() {
		return IBE_QUICK_LOGIN_URL;
	}

	public static String getIbeLoginTypeJson() {
		return IBE_LOGIN_TYPE_JSON;
	}

	public static String getIbeLoginKeepMe() {
		return IBE_LOGIN_KEEP_ME;
	}

	public static String getIbeLoginPwdNotenc() {
		return IBE_LOGIN_PWD_NOTENC;
	}

	public static String getIbeLoginBrand() {
		return IBE_LOGIN_BRAND;
	}

	public static String getSitelabIbeConnectionTimeout() {
		return SITELAB_IBE_CONNECTION_TIMEOUT;
	}

	public static String getHotelSearchPageUrl() {
		return HOTEL_SEARCH_PAGE_URL;
	}

	public static String getHotelSearchPageUrlFa() {
		return HOTEL_SEARCH_PAGE_URL_FA;
	}

	public static String getHotelSearchPageUrlCp() {
		return HOTEL_SEARCH_PAGE_URL_CP;
	}

	public static String getHotelSearchPageUrlFag() {
		return HOTEL_SEARCH_PAGE_URL_FAG;
	}

	public static String getHotelSearchPageUrlCb() {
		return HOTEL_SEARCH_PAGE_URL_CB;
	}

	public static String getHotelSearchPageUrlFi() {
		return HOTEL_SEARCH_PAGE_URL_FI;
	}

	public static String getHotelSearchPageUrlOne() {
		return HOTEL_SEARCH_PAGE_URL_ONE;
	}

	public static String getSitelabIdioma() {
		return SITELAB_IDIOMA;
	}

	public static String getSitelabIbeWidgetCombohotelPrefix() {
		return SITELAB_IBE_WIDGET_COMBOHOTEL_PREFIX;
	}

	public static String getSitelabIbeWidgetAutocompletePrefix() {
		return SITELAB_IBE_WIDGET_AUTOCOMPLETE_PREFIX;
	}

	public static String getUtf8() {
		return UTF8;
	}

	public static String getHotelFlightCarParamKey() {
		return HOTEL_FLIGHT_CAR_PARAM_KEY;
	}

	public static String getHotelFlightParamKey() {
		return HOTEL_FLIGHT_PARAM_KEY;
	}

	public static String getHotelCarParamKey() {
		return HOTEL_CAR_PARAM_KEY;
	}

	public static String getFlightParamKey() {
		return FLIGHT_PARAM_KEY;
	}

	public static String getCarParamKey() {
		return CAR_PARAM_KEY;
	}

	public static String getActivitiesParamKey() {
		return ACTIVITIES_PARAM_KEY;
	}

	public static String getSitelabIbeHostUrl() {
		return SITELAB_IBE_HOST_URL;
	}

	public static String getSitelabIbeHostUrlHttp() {
		return SITELAB_IBE_HOST_URL_HTTP;
	}

	public static String getSitelabIbeAquaHotelName() {
		return SITELAB_IBE_AQUA_HOTEL_NAME;
	}

	public static String getSitelabIbeWidgetAllInclusiveHotels() {
		return SITELAB_IBE_WIDGET_ALL_INCLUSIVE_HOTELS;
	}

	public static String getIbeShowallOrgnFaUrl() {
		return IBE_SHOWALL_ORGN_FA_URL;
	}

	public static String getIbeShowallOrgnCpUrl() {
		return IBE_SHOWALL_ORGN_CP_URL;
	}

	public static String getSitelabDestinationNoofattractions() {
		return SITELAB_DESTINATION_NOOFATTRACTIONS;
	}

	public static String getSitelabDestinationAttractiontype() {
		return SITELAB_DESTINATION_ATTRACTIONTYPE;
	}

	public static String getHotelSearchShowAll() {
		return HOTEL_SEARCH_SHOW_ALL;
	}

	public static String getTravelAgencyEmailTo() {
		return TRAVEL_AGENCY_EMAIL_TO;
	}

	public static String getTravelAgencyEmailFrom() {
		return TRAVEL_AGENCY_EMAIL_FROM;
	}

	public static String getBrandNameKeyPrefix() {
		return BRAND_NAME_KEY_PREFIX;
	}

	public static String getBrandNameKeySeprator() {
		return BRAND_NAME_KEY_SEPRATOR;
	}

	public static String getBrandNameKeyPostfix() {
		return BRAND_NAME_KEY_POSTFIX;
	}

	public static String getSitelabCpFilterKeyword() {
		return SITELAB_CP_FILTER_KEYWORD;
	}

	public static String getSitelabFagRoomsTypeJuniorsuits() {
		return SITELAB_FAG_ROOMS_TYPE_JUNIORSUITS;
	}

	public static String getSitelabFagRoomsTypeStandardsuits() {
		return SITELAB_FAG_ROOMS_TYPE_STANDARDSUITS;
	}

	public static String getSitelabFacilityDiningPopup() {
		return SITELAB_FACILITY_DINING_POPUP;
	}

	public static String getSitelabFacilityRestaurantPopup() {
		return SITELAB_FACILITY_RESTAURANT_POPUP;
	}

	public static String getSitelabFacilityFiestaKidsPopup() {
		return SITELAB_FACILITY_FIESTA_KIDS_POPUP;
	}

	public static String getSitelabFacilitySpaPopup() {
		return SITELAB_FACILITY_SPA_POPUP;
	}

	public static String getSitelabFacilityMeetingEventsPopup() {
		return SITELAB_FACILITY_MEETING_EVENTS_POPUP;
	}

	public static String getSitelabNetConnectionTimeout() {
		return SITELAB_NET_CONNECTION_TIMEOUT;
	}

	public static String getSitelabHotelSearchDefaultRecordPerPage() {
		return SITELAB_HOTEL_SEARCH_DEFAULT_RECORD_PER_PAGE;
	}

	public static String getTravelAgencyEmailSubject() {
		return TRAVEL_AGENCY_EMAIL_SUBJECT;
	}

	public static String getSitelabGoogleMapScriptFilePath() {
		return SITELAB_GOOGLE_MAP_SCRIPT_FILE_PATH;
	}

	public static String getSitelabOutgoingUrlTrimTokens() {
		return SITELAB_OUTGOING_URL_TRIM_TOKENS;
	}

	public static String getSitelabCmsConsumerUrlDefaultLanguage() {
		return SITELAB_CMS_CONSUMER_URL_DEFAULT_LANGUAGE;
	}

	public static int getHotelImagecarouselImgAltTag() {
		return HOTEL_IMAGECAROUSEL_IMG_ALT_TAG;
	}

	public static int getDestinaionImagecarouselImgAltTag() {
		return DESTINAION_IMAGECAROUSEL_IMG_ALT_TAG;
	}

	public static int getFacilityImgAltTag() {
		return FACILITY_IMG_ALT_TAG;
	}

	public static int getHoteRoomsImageAltTag() {
		return HOTE_ROOMS_IMAGE_ALT_TAG;
	}

	public static int getHotelSearchImageAltTag() {
		return HOTEL_SEARCH_IMAGE_ALT_TAG;
	}

	public static int getDestinationSearchImageAltTag() {
		return DESTINATION_SEARCH_IMAGE_ALT_TAG;
	}

	public static int getSpecialOfferSearchImageAltTag() {
		return SPECIAL_OFFER_SEARCH_IMAGE_ALT_TAG;
	}

	public static String getSitelabIbeUrlParamBrandCode() {
		return SITELAB_IBE_URL_PARAM_BRAND_CODE;
	}
    
    
    
}
