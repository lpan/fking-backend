(ns fking-backend.views.content
  (require [fking-backend.views.layout :as l]))

(defn -index
  []
  [:p "Hello World!!"])

(defn -not-found
  []
  [:p "404 Not Found"])

(def index (partial l/page (-index)))

(def not-found (partial l/page (-not-found)))
