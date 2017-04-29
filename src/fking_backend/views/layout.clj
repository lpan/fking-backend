(ns fking-backend.views.layout
  (require [hiccup.page :refer [html5]]))

(defn page
  [content]
  (html5
    [:head
     [:title "BACKEND hehe"]]
    [:body
     [:div.container content]]))
