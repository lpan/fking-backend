(ns fking-backend.views.content
  (require [fking-backend.views.layout :as l]))

(defn -index
  []
  [:div
   [:h1 "Welcome to my shitty website"]
   [:p "Please choose what to do"]
   [:ul
    [:li
     [:a {:href "/signin"} "Sign in"]]
    [:li
     [:a {:href "/signup"} "Sign up"]]]])

(defn -signin
  []
  [:div
   [:h1 "Sign In"]])

(defn -signup
  []
  [:div
   [:h1 "Sign Up"]])

(defn -not-found
  []
  [:p "404 Not Found"])

(def index (comp l/root -index))

(def signin (comp l/page -signin))

(def signup (comp l/page -signup))

(def not-found (comp l/page -not-found))
