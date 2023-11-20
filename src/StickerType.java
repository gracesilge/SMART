public class StickerType extends ItemType{
    public StickerType(String name){
        super();
    String[] approved = {"tidyversePin", "RStudioPin", "PinsPin", "ggplot2Pin", "shinyPin", "devtools", "dplyr", "forcats", "ggplot2Magnet", "ggplot2", "glue", "knitr", "lubridate", "magrittr", "parsnip", "pkgdown", "plumber", "purrr", "posit", "Quarto", "readr", "readxl", "recipes", "reprex", "rmarkdown", "rsample", "RStudio", "shinyDecal", "shiny", "stringr", "testthat", "tibble", "tidymodels", "tidyr", "tidyverse", "usethis", "vctrs", "xaringan"};
    super.setName(name, approved);
    }
}
