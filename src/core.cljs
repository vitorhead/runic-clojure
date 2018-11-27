(ns core
  (:require [reagent.core :as r]
            [runes :as runes]))

(def input-text (r/atom ""))

(defn atomic-input [a]
  [:textarea.input-translate {:placeholder "text to translate!"
                              :on-change #(reset! a (-> %
                                                        .-target
                                                        .-value))}])

(defn app
  []
  [:div.fullscreen
   [atomic-input input-text]
   [:textarea.translated {:placeholder "translated text!"
                          :value (apply str (runes/translate-text (clojure.string/lower-case @input-text)))}]])

(defn ^:export main
  []
  (r/render
    [app]
    (.getElementById js/document "app")))
