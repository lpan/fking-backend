(ns fking-backend.views.layout
  (require [hiccup.page :refer [html5]]))

(defn root
  [content]
  (html5
    [:head
     [:title "BACKEND hehe"]]
    [:body
     [:div.container content]]))

(defn page
  [content]
  (root [:div
         [:a {:href "/"} "Back"]
         content]))
