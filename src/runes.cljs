(ns runes)

;https://www.furorteutonicus.eu/germanic/runescribe/index.php
(def runes "ᚨᛒᚲᛞᛖᚠᚷᚺᛇᚲᛚᛗᚾᛟᛈᛩᚱᛋᛏᚢᚡᚹᛪᛃᛋᛎ")
(def alphabet "abcdefghijklmnopqrstuvwxyz")
(def values (zipmap alphabet runes))

(defn is-in?
  [elem col]
  (some #(= elem %) col))

(defn translate
  [s]
  (values s))

(defn translate-text
  [text]
  (map #(or (translate %) %) text))
