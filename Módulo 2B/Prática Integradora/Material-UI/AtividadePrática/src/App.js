import React from 'react';
import Header from "./components/header";
import ListarTarefa from "./pages/tarefa/ListarTarefa";
import CssBaseline from '@mui/material/CssBaseline';
import { createTheme, ThemeProvider as MuiThemeProvider } from '@mui/material/styles';
import { ThemeProvider, useTheme } from './context/themeContext';

const lightTheme = createTheme({
  palette: {
    mode: 'light',
  },
});

const darkTheme = createTheme({
  palette: {
    mode: 'dark',
  },
});

const AppContent = () => {
  const { mode } = useTheme();

  return (
    <MuiThemeProvider theme={mode === 'light' ? lightTheme : darkTheme}>
      <CssBaseline />
      <Header />
      <ListarTarefa />
    </MuiThemeProvider>
  );
};

const App = () => (
  <ThemeProvider>
    <AppContent />
  </ThemeProvider>
);

export default App;
