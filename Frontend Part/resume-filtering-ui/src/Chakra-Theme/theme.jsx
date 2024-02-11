import { extendTheme } from "@chakra-ui/react";

export const theme = extendTheme({
  fonts: {
    heading: "Ubuntu",
    body: "Ubuntu",
    fontSize: "20px",
  },
  fontSizes: {
    xs: "5px",
    sm: "10px",
    base: {
      base: "16px",
      md: "18px",
    },
    lg: {
      base: "18px",
      md: "20px",
    },
  },
});
